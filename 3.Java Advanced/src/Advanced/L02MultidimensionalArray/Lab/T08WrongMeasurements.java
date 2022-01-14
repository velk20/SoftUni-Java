package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] wrongNum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int theNum = matrix[wrongNum[0]][wrongNum[1]];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == theNum) {
                    //up
                    if (i - 1 >= 0) {
                        if (matrix[i - 1][j] != theNum) {
                            sum += matrix[i - 1][j];
                        }
                    }

                    //down
                    if (i + 1 < matrix.length) {
                        if (matrix[i + 1][j] != theNum) {
                            sum += matrix[i + 1][j];
                        }
                    }

                    //left
                    if (j - 1 >= 0) {
                        if (matrix[i][j - 1] != theNum) {
                            sum += matrix[i][j - 1];
                        }
                    }

                    //right
                    if (j + 1 < matrix[i].length) {
                        if (matrix[i][j + 1] != theNum) {
                            sum += matrix[i][j + 1];
                        }
                    }

                    matrix[i][j] = sum;
                }
                sum = 0;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }


}
