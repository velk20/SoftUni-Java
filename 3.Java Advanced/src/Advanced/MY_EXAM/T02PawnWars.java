package Advanced.MY_EXAM;

import java.util.Scanner;

public class T02PawnWars {
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
            if (IsInMatrix(whiteRows - 1, whiteCols - 1) && matrix[whiteRows - 1][whiteCols - 1] == 'b') {
                String position = SetPosition(whiteRows - 1, whiteCols - 1);
                System.out.printf("Game over! White capture on %s.", position);
                break;
            } else if (IsInMatrix(whiteRows - 1, whiteCols + 1) && matrix[whiteRows - 1][whiteCols + 1] == 'b') {
                String position = SetPosition(whiteRows - 1, whiteCols + 1);
                System.out.printf("Game over! White capture on %s.", position);
                break;
            } else {
                matrix[whiteRows][whiteCols] = '-';
                whiteRows--;
                matrix[whiteRows][whiteCols] = 'w';

                if (whiteRows == 0) {
                    String position = SetPosition(whiteRows, whiteCols);
                    System.out.printf("Game over! White pawn is promoted to a queen at %s.",position);
                    break;
                }
            }

            if (IsInMatrix(blackRows + 1, blackCols - 1) && matrix[blackRows + 1][blackCols - 1] == 'w') {
                String position = SetPosition(blackRows + 1, blackCols - 1);
                System.out.printf("Game over! Black capture on %s.", position);
                break;
            } else if (IsInMatrix(blackRows + 1, blackCols + 1) && matrix[blackRows + 1][blackCols + 1] == 'w') {
                String position = SetPosition(blackRows + 1, blackCols + 1);
                System.out.printf("Game over! Black capture on %s.", position);
                break;
            } else {
                matrix[blackRows][blackCols] = '-';
                blackRows++;
                matrix[blackRows][blackCols] = 'b';
                if (blackRows == 7) {
                    String position = SetPosition(blackRows, blackCols);
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s.",position);
                    break;
                }
            }
        }



        
    }
    private static boolean IsInMatrix(int row,int col)
    {
        return row >= 0 && row <= 7 && col >= 0 && col <= 7;
    }
    private static String SetPosition(int row, int col)
    {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 8; i >= 0; i--)
        {
            if (col == i)
            {
                stringBuilder.append((char)(i + 97));
            }
        }

        int counter = 8;
        for (int i = 0; i < 8; i++)
        {
            if (row == i)
            {
                stringBuilder.append(counter);
            }
            counter--;
        }
        return stringBuilder.toString();
    }
}
