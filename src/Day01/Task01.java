package Day01;

import java.util.Scanner;

public class Task01 {

    /*1) Ask user to input two numbers, compare them and output result:
    Input:
    Enter value a: 10
    Enter value b: 10
    Expected output:
    is 10 equal to 10? - true
    is 10 less than 10? - false
    is 10 less or equal to 10? - true
    is 10 greater than 10? - false
    is 10 greater or equal to 10? - true*/

    public static void main(String[] args) {

        System.out.println("Please input number one: " );
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        System.out.println("Pleas input number two: ");
        int numberTwo = scanner.nextInt();
        scanner.close();

        boolean isEqual = (numberOne == numberTwo);
        System.out.println("Is " + numberOne + " equal to " + numberTwo + "? - " + isEqual);

        boolean isLess = (numberOne < numberTwo);
        System.out.println("Is " + numberOne + " less than " + numberTwo + "? - " + isLess);

        boolean isLessOrEqual = (numberOne <= numberTwo);
        System.out.println("Is " + numberOne + " less than or equal to " + numberTwo + "? - " + isLessOrEqual);

        boolean isGreater = (numberOne > numberTwo);
        System.out.println("Is " + numberOne + " greater than " + numberTwo + "? - " + isGreater);

        boolean isGreaterOrEqual = (numberOne >= numberTwo);
        System.out.println("Is " + numberOne + " greater than or equal to " + numberTwo + "? - " + isGreaterOrEqual);
    }
}
