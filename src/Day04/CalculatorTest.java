package Day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Multiplication test")
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5), "failed at the start");
    }

    @RepeatedTest(2)
    @DisplayName("Multiplication with zero tests")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 15), "failed with zero was first");
        assertEquals(0, calculator.multiply(15, 0), "failed with zero was last");
    }

    @Test
    @DisplayName("Division test")
    void testDivide() {
        assertEquals(3, calculator.divide(30, 10), "division failed");
    }

    @Test
    @DisplayName("Division with zero tests")
    void testDivideWithZero() {
        assertEquals(0, calculator.divide(0, 5), "division failed with zero was first");
        Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "division by zero");
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Summation test")
    void testSummation() {
        assertEquals(13, calculator.add(7, 6), "7 + 6 should be 13");
    }

    @Test
    @DisplayName("Subtraction test")
    void testSubtraction() {
        assertEquals(-5, calculator.subtract(0, 5));
        assertEquals(0, calculator.subtract(5, 5));
    }
}