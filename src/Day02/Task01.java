package Day02;

public class Task01 {

    /*1) Write a program which creates two-dimensional array and stores multiplication table (from 1 - 10) in it.

    Example of output:
            1 * 1 = 1
            1 * 2 = 2
            1 * 3 = 3
            ....
            10 * 9 = 90
            10 * 10 = 100

    Hint:
            1) don't forget that you have to save the values in array and output them from array.
            2) Arrays should be the size of [10][10]*/

    public static void main(String[] args) {

        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
//                System.out.println(table[i][j]);
                System.out.println((i + 1) + " * " + (j + 1) + " = " + table[i][j]);
            }
        }

    }
}