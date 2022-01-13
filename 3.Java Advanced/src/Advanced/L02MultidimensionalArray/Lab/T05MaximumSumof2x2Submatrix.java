package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T05MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] colsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row = colsAndCols[0];
        int col = colsAndCols[1];

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = 0;
        int bestRow = 0;
        int bestCol = 0;

        for (int rows = 0; rows < matrix.length - 1; rows++) {
            int[] arr = matrix[rows];
            int[] arr2 = matrix[rows + 1];

            for (int i = 0; i < arr.length - 1; i++) {

                if (matrix[rows][i] + matrix[rows][i + 1] + matrix[rows + 1][i] + matrix[rows + 1][i + 1] > sum) {
                    sum = matrix[rows][i] + matrix[rows][i + 1] + matrix[rows + 1][i] + matrix[rows + 1][i + 1];
                    bestRow = rows;
                    bestCol = i;
                }
            }
        }
        System.out.println(matrix[bestRow][bestCol] +" "+ matrix[bestRow][bestCol + 1]);
        System.out.println(matrix[bestRow+1][bestCol] +" "+ matrix[bestRow+1][bestCol + 1]);
        System.out.println(sum);
    }
}
