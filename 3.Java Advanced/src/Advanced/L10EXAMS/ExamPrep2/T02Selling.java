package Advanced.L10EXAMS.ExamPrep2;

import java.util.Scanner;

public class T02Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][];

        int sRow = 0;
        int sCol = 0;

        int totalMoney = 0;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'S') {
                    sRow = i;
                    sCol = j;
                }
            }
        }

        boolean enoughMoney = false;

        boolean outOfBakery = false;

        while (!enoughMoney && !outOfBakery) {
            String string = scanner.nextLine();
            matrix[sRow][sCol] = '-';


            switch (string) {
                case "up":
                    sRow--;
                    break;
                case "down":
                    sRow++;
                    break;
                case "left":
                    sCol--;
                    break;
                case "right":
                    sCol++;
                    break;
            }

            if (!isInBounds(matrix, sRow, sCol)) {
                outOfBakery = true;
                break;
            }


            if (matrix[sRow][sCol] == '-') {
                matrix[sRow][sCol] = 'S';
            }

           else  if (Character.isDigit(matrix[sRow][sCol])) {
                totalMoney+= Character.getNumericValue(matrix[sRow][sCol]);
                matrix[sRow][sCol] = 'S';
            } else if (matrix[sRow][sCol] == 'O') {
                matrix[sRow][sCol] = '-';
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == 'O') {
                            matrix[i][j] = 'S';
                            sRow = i;
                            sCol = i;
                        }
                    }
                }
            }

                matrix[sRow][sCol] = 'S';


            if (totalMoney >= 50) {
                enoughMoney = true;
            }

        }

        if (outOfBakery) {
            System.out.println("Bad news, you are out of the bakery.");
        }
        if (totalMoney>=50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.printf("Money: %d\n", totalMoney);

        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

    }

    public static boolean isInBounds(char[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
            return true;
        }
        return false;

    }
}
