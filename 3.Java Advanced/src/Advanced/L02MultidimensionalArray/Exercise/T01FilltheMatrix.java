package Advanced.L02MultidimensionalArray.Exercise;

import java.util.*;

public class T01FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int sizeOfMatrix = Integer.parseInt(input[0]);
        String pattern = input[1];

        if (pattern.equals("A")) {
            int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
            patternA(matrix);

        } else if (pattern.equals("B")) {
            int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
            patternB(matrix);

        }
    }


    public static void patternA(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }

        printMatrix(matrix);
    }

    public static void patternB(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
