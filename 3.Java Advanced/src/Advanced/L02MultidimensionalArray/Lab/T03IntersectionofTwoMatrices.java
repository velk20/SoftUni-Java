package Advanced.L02MultidimensionalArray.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T03IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][];
        char[][] secondMatrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            char[] input = scanner.nextLine().replaceAll("\\s+","").toCharArray();
            firstMatrix[i] = input;
        }
        for (int i = 0; i < rows; i++) {
            char[] input = scanner.nextLine().replaceAll("\\s+","").toCharArray();
            secondMatrix[i] = input;
        }

        for (int rowss = 0; rowss < firstMatrix.length; rowss++) {
            for (int colss = 0; colss < firstMatrix[rowss].length; colss++) {
                if (firstMatrix[rowss][colss] != secondMatrix[rowss][colss]) {
                    secondMatrix[rowss][colss] = '*';
                }
            }
        }

        for (char[] matrix : secondMatrix) {
            for (char c : matrix) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
