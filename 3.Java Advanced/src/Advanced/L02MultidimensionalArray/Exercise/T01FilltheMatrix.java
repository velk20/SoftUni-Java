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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = counter;
                counter++;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }

    public static void patternB(int[][] matrix) {
        int counter = 1;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (col % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = counter;
                    counter++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = counter;
                    counter++;
                }
            }
            col++;
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
