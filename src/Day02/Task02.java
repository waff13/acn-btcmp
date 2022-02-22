package Day02;

public class Task02 {

    /* 2) Declare and initialize array with four arbitrary whole numbers.
         Write a Java program to copy this array by iterating it.*/

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8};
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        System.out.print("Copied array: ");
        for (int el : copy) {
            System.out.print(el + " ");
        }
    }
}
