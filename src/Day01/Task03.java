package Day01;

import java.util.Scanner;

public class Task03 {

    /*3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use reminder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)*/

    public static void main(String[] args) {

        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(number % 2 == 0);

    }
}