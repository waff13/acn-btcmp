package Day01;

import java.util.Scanner;

public class Task04 {

    /*4) Ask user to input a whole number and output false, if it is even number and true if it is odd number*/

    public static void main(String[] args) {

        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(number % 2 != 0);

    }
}