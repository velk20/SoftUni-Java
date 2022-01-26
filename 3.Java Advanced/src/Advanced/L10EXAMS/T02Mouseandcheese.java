package Advanced.L10EXAMS;

import java.util.Scanner;

public class T02Mouseandcheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int eatenCheese = 0;
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        int rowOfMice = 0;
        int colOfMice = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'M') {
                    rowOfMice = i;
                    colOfMice = j;
                }
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            matrix[rowOfMice][colOfMice] = '-';
            switch (input) {
                case "right":
                    colOfMice++;
                    break;
                case "left":
                    colOfMice--;
                    break;
                case "up":
                    rowOfMice--;
                    break;
                case "down":
                    rowOfMice++;
                    break;

            }
            if (!isInBounce(matrix, rowOfMice, colOfMice)) {
                System.out.println("Where is the mouse?");
                break;
            }

            if (matrix[rowOfMice][colOfMice] == 'c') {
                eatenCheese++;
            } else if (matrix[rowOfMice][colOfMice] == 'B') {
                continue;
            }
            matrix[rowOfMice][colOfMice] = 'M';

            input = scanner.nextLine();
        }

        if (eatenCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!\n", eatenCheese);
            printMatrix(matrix);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.\n", 5 - eatenCheese);
            printMatrix(matrix);
        }

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.printf(String.valueOf(aChar));
            }
            System.out.println();
        }
    }

    public static boolean isInBounce(char[][] matrix, int rows, int cols) {
        if (rows < 0 || rows >= matrix.length || cols < 0 || cols >= matrix[rows].length) {
            return false;
        }
        return true;
    }
}
