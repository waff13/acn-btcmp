package Day01;

import java.util.Scanner;

public class Task06 {

    /*6) Write a program which asks user to input two whole numbers a and b. Output "true", if one of this condition is true:
            1) a and b is equal
    2) a is less than 0 and b is greater than 0
            3) both of them are greater than 100
    otherwise output "false":
    Examples:
    a is -1 and b is -2 -> false
    a is -2 and b is 1 -> true
    a is -1 and b is -1 -> true
    a is 101 and b is 102 -> true
    a is 99 and b is 200 -> false*/


    public static void main(String[] args) {

        System.out.println("Please input number one: " );
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        System.out.println("Pleas input number two: ");
        int numberTwo = scanner.nextInt();
        scanner.close();

        if ((numberOne == numberTwo) || ((numberOne < 0) && (numberTwo > 0)) || ((numberOne > 100) && (numberTwo > 100))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}