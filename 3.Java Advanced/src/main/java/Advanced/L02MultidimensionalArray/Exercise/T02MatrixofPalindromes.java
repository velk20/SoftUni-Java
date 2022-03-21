package Advanced.L02MultidimensionalArray.Exercise;

import java.util.Scanner;

public class T02MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int initialChar = 97;

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String stringBuilder = String.valueOf((char) (97 + row)) +
                        (char) (initialChar + col) +
                        (char) (97 + row);
                matrix[row][col] = stringBuilder;
            }
            initialChar++;
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}
