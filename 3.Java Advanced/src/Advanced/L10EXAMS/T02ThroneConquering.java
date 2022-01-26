package Advanced.L10EXAMS;

import javax.naming.InitialContext;
import java.util.*;

public class T02ThroneConquering {
    public static boolean dead = false;
    public static boolean findHelena = false;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int initialEnergyOfParis = Integer.parseInt(scanner.nextLine());
        int numberOfRows = Integer.parseInt(scanner.nextLine());
        char[][] matrixField = new char[numberOfRows][];
        for (int i = 0; i < matrixField.length; i++) {
            matrixField[i] = scanner.nextLine().toCharArray();
        }

        int[] cordinatesOfHelan = new int[2];
        int[] cordinatesOfParis = new int[2];

        for (int rows = 0; rows < matrixField.length; rows++) {
            for (int col = 0; col < matrixField[rows].length; col++) {
                if (matrixField[rows][col] == 'H') {
                    cordinatesOfHelan[0] = rows;
                    cordinatesOfHelan[1] = col;
                }

                if (matrixField[rows][col] == 'P') {
                    cordinatesOfParis[0] = rows;
                    cordinatesOfParis[1] = col;
                }
            }
        }

       String input = scanner.nextLine();
        while (initialEnergyOfParis >= 0) {

            String[] tokens = input.split(" ");
            String directionOfMove = tokens[0];
            int rowOfEnemySpawn = Integer.parseInt(tokens[1]);
            int colOfEnemySpawn = Integer.parseInt(tokens[2]);
            matrixField[rowOfEnemySpawn][colOfEnemySpawn] = 'S';

            int rowOfParis = cordinatesOfParis[0];
            int colOfParis = cordinatesOfParis[1];

            int rowOfHelan = cordinatesOfHelan[0];
            int colOfHelan = cordinatesOfHelan[1];

            switch (directionOfMove) {
                case "up":
                    if (isInBounce(matrixField, rowOfParis - 1, colOfParis)) {
                        if (matrixField[rowOfParis - 1][colOfParis] == 'S') {
                            initialEnergyOfParis -= 2;
                            matrixField[rowOfParis - 1][colOfParis] = 'P';
                            matrixField[rowOfParis][colOfParis] = '-';
                            initialEnergyOfParis--;
                            cordinatesOfParis[0] = rowOfParis - 1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);
                        } else if (matrixField[rowOfParis - 1][colOfParis] == 'H') {
                            initialEnergyOfParis--;
                            matrixField[rowOfParis - 1][colOfParis] = '-';
                            matrixField[rowOfParis][colOfParis] = '-';
                            System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", initialEnergyOfParis);
                            printMatrix(matrixField);
                            findHelena = true;
                            break;
                        } else {
                            matrixField[rowOfParis][colOfParis] = '-';
                            matrixField[rowOfParis - 1][colOfParis] = 'P';
                            initialEnergyOfParis--;
                            cordinatesOfParis[0] = rowOfParis - 1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                        }
                    } else {
                        initialEnergyOfParis--;
                        isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                    }
                    break;
                case "down": if (isInBounce(matrixField, rowOfParis + 1, colOfParis)) {
                    if (matrixField[rowOfParis + 1][colOfParis] == 'S') {
                        initialEnergyOfParis -= 2;
                        matrixField[rowOfParis + 1][colOfParis] = 'P';
                        matrixField[rowOfParis][colOfParis] = '-';
                        initialEnergyOfParis--;
                        cordinatesOfParis[0] = rowOfParis + 1;
                        isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                    } else if (matrixField[rowOfParis + 1][colOfParis] == 'H') {
                        initialEnergyOfParis--;
                        matrixField[rowOfParis + 1][colOfParis] = '-';
                        matrixField[rowOfParis][colOfParis] = '-';
                        System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", initialEnergyOfParis);
                        findHelena = true;

                        printMatrix(matrixField);
                        break;
                    } else {
                        matrixField[rowOfParis][colOfParis] = '-';
                        matrixField[rowOfParis + 1][colOfParis] = 'P';
                        initialEnergyOfParis--;
                        cordinatesOfParis[0] = rowOfParis + 1;
                        isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                    }
                } else {
                    initialEnergyOfParis--;
                    isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                }
                    break;
                case "left":
                    if (isInBounce(matrixField, rowOfParis, colOfParis-1)) {
                        if (matrixField[rowOfParis][colOfParis-1] == 'S') {
                            initialEnergyOfParis -= 2;
                            matrixField[rowOfParis][colOfParis-1] = 'P';
                            matrixField[rowOfParis][colOfParis] = '-';
                            initialEnergyOfParis--;
                            cordinatesOfParis[1] = colOfParis-1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                        } else if (matrixField[rowOfParis][colOfParis-1] == 'H') {
                            initialEnergyOfParis--;
                            matrixField[rowOfParis][colOfParis-1] = '-';
                            matrixField[rowOfParis][colOfParis] = '-';
                            System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", initialEnergyOfParis);
                            findHelena = true;

                            printMatrix(matrixField);
                            break;
                        } else {
                            matrixField[rowOfParis][colOfParis] = '-';
                            matrixField[rowOfParis][colOfParis-1] = 'P';
                            initialEnergyOfParis--;
                            cordinatesOfParis[1] = colOfParis-1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                        }
                    } else {
                        initialEnergyOfParis--;
                        isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                    }
                    break;
                case "right":
                    if (isInBounce(matrixField, rowOfParis, colOfParis+1)) {
                        if (matrixField[rowOfParis][colOfParis+1] == 'S') {
                            initialEnergyOfParis -= 2;
                            matrixField[rowOfParis][colOfParis+1] = 'P';
                            matrixField[rowOfParis][colOfParis] = '-';
                            initialEnergyOfParis--;
                            cordinatesOfParis[1] = colOfParis+1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                        } else if (matrixField[rowOfParis][colOfParis+1] == 'H') {
                            initialEnergyOfParis--;
                            matrixField[rowOfParis][colOfParis+1] = '-';
                            matrixField[rowOfParis][colOfParis] = '-';
                            System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", initialEnergyOfParis);
                            findHelena = true;

                            printMatrix(matrixField);
                            break;
                        } else {
                            matrixField[rowOfParis][colOfParis] = '-';
                            matrixField[rowOfParis][colOfParis+1] = 'P';
                            initialEnergyOfParis--;
                            cordinatesOfParis[1] = colOfParis+1;
                            isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                        }
                    } else {
                        initialEnergyOfParis--;
                        isDead(matrixField, rowOfParis, colOfParis, initialEnergyOfParis);

                    }
                    break;

            }
            if (dead) {
                break;
            }
            if (findHelena) {
                break;

            }
            input = scanner.nextLine();
        }

        if (dead) {
            System.out.printf("Paris died at %d;%d.\n", cordinatesOfParis[0], cordinatesOfParis[1]);
            printMatrix(matrixField);

        }
    }

    public static boolean isInBounce(char[][] matrix, int rows, int cols) {
        if (rows < 0 || rows >= matrix.length || cols < 0 || cols >= matrix[rows].length) {
            return false;
        }
        return true;
    }

    public static void printMatrix(char[][] matrixField) {
        for (char[] chars : matrixField) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static void isDead(char[][]matrixField, int rowOfParis, int colOfParis, int initialEnergyOfParis) {
        if (initialEnergyOfParis <= 0) {
            matrixField[rowOfParis - 1][colOfParis] = 'X';
            dead = true;

        }
    }

}
