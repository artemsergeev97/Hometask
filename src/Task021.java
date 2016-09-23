/**
 * @autor Sergeev Artem
 * 11-506
 * 021
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task021 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int center = 5;
        int centerL = 2;
        int centerR = 8;

        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 11; ++column) {
                if (column >= center - row && column <= center + row)
                    System.out.print("x"); // Replace with whatever character to print.
                else
                    System.out.print(" ");
            }
            System.out.println(); // Line break after each row, of course.
        }

        for (int rowB = 0; rowB < 3; rowB++) {
            for (int columnL = 0; columnL < 5; columnL++) {
                if (columnL >= centerL - rowB && columnL <= centerL + rowB)
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            for (int columnR = 5; columnR < 11; columnR++) {
                if (columnR >= centerR - rowB && columnR <= centerR + rowB)
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
