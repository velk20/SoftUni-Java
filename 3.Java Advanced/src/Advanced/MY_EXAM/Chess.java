package Advanced.MY_EXAM;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];


        int whiteRows = 0;
        int whiteCols = 0;

        int blackRows = 0;
        int blackCols = 0;

        for (int i = 0; i < 8; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'w') {
                    whiteRows = i;
                    whiteCols = j;
                } else if (matrix[i][j] == 'b') {
                    blackRows = i;
                    blackCols = j;
                }
            }
        }

        while (true) {
            //left diagonal
            if (isInMatrix(whiteRows - 1, whiteCols - 1) && matrix[whiteRows-1][whiteCols-1] == 'b') {
                String position = findPosition(whiteRows - 1, whiteCols - 1);
                System.out.printf("Game over! White capture on %s.", position);
                break;

            }
            //right diagonal
            else if (isInMatrix(whiteRows - 1, whiteCols + 1) && matrix[whiteRows - 1][whiteCols + 1] == 'b') {
                String position = findPosition(whiteRows - 1, whiteCols + 1);
                System.out.printf("Game over! White capture on %s.", position);
                break;
            } else {
                matrix[whiteRows][whiteCols] = '-';
                matrix[whiteRows - 1][whiteCols] = 'w';
                whiteRows--;

                if (whiteRows == 0) {
                    String position = findPosition(whiteRows, whiteCols);
                    System.out.printf("Game over! White pawn is promoted to a queen at %s.", position);
                    break;
                }
            }

            if (isInMatrix(blackRows + 1, blackCols - 1) && matrix[blackRows + 1][blackCols - 1] == 'w') {
                String position = findPosition(blackRows + 1, blackCols - 1);
                System.out.printf("Game over! Black capture on %s.", position);
                break;
            } else if (isInMatrix(blackRows + 1, blackCols + 1) && matrix[blackRows + 1][blackCols + 1] == 'w') {
                String position = findPosition(blackRows + 1, blackCols + 1);
                System.out.printf("Game over! Black capture on %s.", position);
                break;
            } else {
                matrix[blackRows][blackCols] = '-';
                blackRows++;
                matrix[blackRows][blackCols] = 'b';

                if (blackRows == 7) {
                    String position = findPosition(blackRows, blackCols);
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s.", position);
                    break;
                }


            }

        }





    }

    public static String findPosition(int row, int col) {
        String num = String.format("%c", col + 97);
        int countLetter = 8 - row;
        return String.format("%s", num + countLetter);
    }

    public static boolean isInMatrix(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
