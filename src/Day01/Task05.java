package Day01;

import java.util.Scanner;

public class Task05 {

    /*5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
    Enter boolean value: true
    Expected output:
    Opposite of "true" is "false"*/

    public static void main(String[] args) {

        System.out.println("Please input a boolean value :");
        Scanner scanner = new Scanner(System.in);
        boolean input = scanner.nextBoolean();
        scanner.close();
        System.out.println("The opposite of " + input + " is " + !input);

    }
}