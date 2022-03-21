package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCows = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCows[0];
        int cols = rowsAndCows[1];

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int num = Integer.parseInt(scanner.nextLine());
        boolean flagOfFoudnation = false;
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                if (matrix[i][j] == num) {
                    flagOfFoudnation = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (!flagOfFoudnation) {
            System.out.println("not found");
        }
    }
}
