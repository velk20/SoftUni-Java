package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T06PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[] firstDiagonal = new int[n];
        for (int i = 0; i < n; i++) {
            firstDiagonal[i] = matrix[i][i];
        }

        int[] secondDiagonal = new int[n];
        for (int i = 0; i < n; i++) {
            secondDiagonal[i] = matrix[n-1-i][i];
        }

        for (int i : firstDiagonal) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : secondDiagonal) {
            System.out.print(i+" ");
        }
    }
}
