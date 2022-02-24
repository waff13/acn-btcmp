package Day01;

import java.util.Scanner;

public class Task02 {

    /*2) Ask user to input two boolean values and compare them.
        Input:
        Enter b1: true
        Enter b2: false

        Expected output:
        Is b1 and b2 equal? - false*/

    public static void main(String[] args) {

        System.out.println("Enter b1: ");
        Scanner scanner = new Scanner(System.in);
        boolean b1 = scanner.nextBoolean();
        System.out.println("Enter b2: ");
        boolean b2 = scanner.nextBoolean();
        scanner.close();

        boolean result = (b1 == b2);
        System.out.println("Is " + b1 + " equal to " + b2 + "? - " + result);

    }
}