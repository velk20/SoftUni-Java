package Advanced.L02MultidimensionalArray.Exercise;

import java.util.*;

public class T03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int primaryDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonal += matrix[i][i];
        }

        int row = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            secondDiagonal += matrix[row][i];
            row++;
        }

        System.out.println(Math.abs(primaryDiagonal - secondDiagonal));
    }
}
