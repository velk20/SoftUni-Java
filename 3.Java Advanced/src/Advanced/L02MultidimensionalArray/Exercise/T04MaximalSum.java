package Advanced.L02MultidimensionalArray.Exercise;

import javax.swing.plaf.ColorUIResource;
import java.io.StreamTokenizer;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class T04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowsAndCols[0]][rowsAndCols[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] bestMatrix = new int[3][3];

        int bestSum = 0;

        for (int rows = 0; rows < matrix.length-1; rows++) {
            for (int cols = 0; cols < matrix[rows].length - 1; cols++) {
                if (validCordinates(matrix,rows,cols)) {
                    int currentSum = 0;

                    currentSum =
                            matrix[rows][cols] + matrix[rows - 1][cols] + matrix[rows + 1][cols]
                                    + matrix[rows][cols - 1] + matrix[rows][cols + 1] + matrix[rows - 1][cols - 1]
                                    + matrix[rows - 1][cols + 1] + matrix[rows + 1][cols - 1] + matrix[rows + 1][cols + 1];

                    if (currentSum > bestSum) {
                        bestSum = currentSum;
                        bestMatrix = new int[][]{
                                {matrix[rows - 1][cols - 1], matrix[rows - 1][cols], matrix[rows - 1][cols + 1]},
                                {matrix[rows][cols - 1], matrix[rows][cols], matrix[rows][cols + 1]},
                                {matrix[rows + 1][cols - 1], matrix[rows + 1][cols], matrix[rows + 1][cols + 1]},
                        };
                    }

                }
            }
        }
        System.out.println("Sum = " + bestSum);
        for (int[] ints : bestMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

    }

    private static boolean validCordinates(int[][] matrix, int rows, int cols) {
        if (rows - 1 < 0 || rows + 1 >= matrix.length || cols - 1 < 0 || cols + 1 >= matrix[rows].length) {
            return false;
        }
        return true;
    }
}
