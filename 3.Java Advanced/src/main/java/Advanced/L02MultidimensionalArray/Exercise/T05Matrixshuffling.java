package Advanced.L02MultidimensionalArray.Exercise;

import java.util.*;

public class T05Matrixshuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = cordinates[0];
        int cols = cordinates[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            if (swapCommandIsValid(tokens, matrix)) {
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                int firstElement = matrix[row1][col1];
                int secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                for (int[] ints : matrix) {
                    for (int anInt : ints) {
                        System.out.print(anInt+" ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean swapCommandIsValid(String[] tokens, int[][] matrix) {

        if (tokens.length != 5) {
            return false;
        }

        if (!tokens[0].equals("swap")) {
            return false;
        }

        int row1 = Integer.parseInt(tokens[1]);
        int col1 = Integer.parseInt(tokens[2]);
        int row2 = Integer.parseInt(tokens[3]);
        int col2 = Integer.parseInt(tokens[4]);

        if (row1 < 0 || row1 >= matrix.length || col1 < 0 || col1 >= matrix[row1].length || row2 < 0 || row2 >= matrix.length || col2 < 0 || col2 >= matrix[row2].length) {
            return false;
        }

        return  true;
    }
}
