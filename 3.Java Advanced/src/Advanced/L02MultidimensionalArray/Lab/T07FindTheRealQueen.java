package Advanced.L02MultidimensionalArray.Lab;

import java.util.*;

public class T07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        for (int i = 0; i < 8; i++) {
            matrix[i] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    //check horizontal
                    char[] row = matrix[i];
                    boolean flagForHorizontalEnemy = false;
                    for (int k = 0; k < row.length; k++) {
                        if (row[k] == 'q') {
                            flagForHorizontalEnemy = true;
                            break;
                        }
                    }

                    //check verticals
                    boolean flagForVerticalEnemy = false;
                    for (int k = 0; k < 8; k++) {
                        char element = matrix[k][j];
                        if (element == 'q') {
                            flagForVerticalEnemy = true;
                            break;
                        }
                    }

                    //check firstDiagonal
                    boolean flagForFirstDiagonalEnemy = false;
                    for (int k = 1; k < 8; k++) {
                        if (matrix[i - k][j + k] == 'q') {
                            flagForFirstDiagonalEnemy = true;
                                    break;
                        }
                    }

                    for (int k = 1; k < 8; k++) {
                        if (matrix[i + k][i - k] == 'q') {
                            flagForFirstDiagonalEnemy = true;
                            break;
                        }
                    }

                    //check SecondDiagonal
                    boolean flagForSecondDiagonalEnemy = false;
                    for (int k = 0; k < 8; k++) {

                    }
                }
            }
        }
    }


}
