package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCows = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCows[0];
        int cols = rowsAndCows[1];

        int[][] firstMatrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                firstMatrix[i] = arr;
        }

        rowsAndCows = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        rows = rowsAndCows[0];
        cols = rowsAndCows[1];

        int[][] secondMatrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int[] arr= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = arr;
        }

        if (areMatrixEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");

        }else System.out.println("not equal");

    }

    public static boolean areMatrixEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            int[] arr1 = firstMatrix[i];
            int[] arr2 = secondMatrix[i];
            if (arr1.length != arr2.length) {
                return  false;
            }

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != arr2[j]) {
                    return false;
                }

            }
        }

        return true;
    }


}
