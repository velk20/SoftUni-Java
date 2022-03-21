package Advanced.L10EXAMS.JavaAdvancedExam28June2020;

import java.util.Scanner;

public class T02Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][];

        int snakeRow = 0;
        int snakeCol = 0;


        for (int i = 0; i < n; i++) {
            char[] arr = scanner.nextLine().toCharArray();
            matrix[i] = arr;
            for (int j = 0; j < arr.length; j++) {
                if (matrix[i][j] == 'S') {
                    snakeRow = i;
                    snakeCol = j;
                }
            }
        }

        int foodQuantity = 0;

        while (foodQuantity < 10) {
            String string = scanner.nextLine();
            matrix[snakeRow][snakeCol] = '.';

            switch (string) {
                case "up":
                    snakeRow--;
                    break;
                case "down":
                    snakeRow++;
                    break;
                case "left":
                    snakeCol--;
                    break;
                case "right":
                    snakeCol++;
                    break;
            }

            if (!inOfBoudns(matrix, snakeRow, snakeCol)) {
                System.out.println("Game over!");
                break;
            } else if (matrix[snakeRow][snakeCol] == '*') {
                foodQuantity++;
                matrix[snakeRow][snakeCol] = 'S';
            } else if (matrix[snakeRow][snakeCol] == 'B') {
                matrix[snakeRow][snakeCol] = '.';
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == 'B') {
                            matrix[i][j] = 'S';
                            snakeCol = j;
                            snakeRow = i;

                        }
                    }
                }
            } else if (matrix[snakeRow][snakeCol] == '-') {
                matrix[snakeRow][snakeCol] = 'S';

            }




        }

        if (foodQuantity >= 10) {
            System.out.println("You won! You fed the snake.");
        }

        System.out.printf("Food eaten: %d\n", foodQuantity);
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }



    }


    public static boolean inOfBoudns(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
