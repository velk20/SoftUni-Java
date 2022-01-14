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
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((char) (97 + row));
                stringBuilder.append((char) (initialChar + col));
                stringBuilder.append((char) (97 + row));
                matrix[row][col] = stringBuilder.toString();
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
