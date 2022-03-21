package OOP.L01WorkingWithAbstraction.Exercise.T05jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = readArray(scanner.nextLine());
        int rows = dimestions[0];
        int cols = dimestions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] hero = readArray(command);
            int[] evil = readArray(scanner.nextLine());
            int evilRow = evil[0];
            int evilCol = evil[1];

            evilMoving(matrix, evilRow, evilCol);

            int heroRow = hero[0];
            int heroCol = hero[1];

            sum = heroMoving(matrix, sum, heroRow, heroCol);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static long heroMoving(int[][] matrix, long sum, int heroRow, int heroCol) {
        while (heroRow >= 0 && heroCol < matrix[1].length) {
            if (heroRow < matrix.length && heroCol >= 0 && heroCol < matrix[0].length) {
                sum += matrix[heroRow][heroCol];
            }

            heroCol++;
            heroRow--;
        }
        return sum;
    }

    private static void evilMoving(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[] readArray(String scanner) {
        return Arrays.stream(scanner.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
