package Advanced.L10EXAMS.JavaAdvancedRetakeExam19August2020;

import java.io.PrintWriter;
import java.rmi.server.RemoteRef;
import java.util.*;


public class T02Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pollinatedFlowersCount = 0;
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        int rowOfBee = 0;
        int colOfBee = 0;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'B') {
                    rowOfBee = i;
                    colOfBee = j;
                }
            }
        }

        String string = scanner.nextLine();
        boolean lostBee = false;
        while (!string.equals("End")) {
            matrix[rowOfBee][colOfBee] = '.';
            switch (string) {
                case "up":
                    rowOfBee--;
                    break;
                case "down":
                    rowOfBee++;
                    break;
                case "left":
                    colOfBee--;
                    break;
                case "right":
                    colOfBee++;
                    break;
            }

            if (isInBounds(matrix, rowOfBee, colOfBee)) {

                if (matrix[rowOfBee][colOfBee] == '.') {
                    matrix[rowOfBee][colOfBee] = 'B';
                } else if (matrix[rowOfBee][colOfBee] == 'f') {
                    matrix[rowOfBee][colOfBee] = 'B';
                    pollinatedFlowersCount++;
                } else if (matrix[rowOfBee][colOfBee] == 'O') {
                    matrix[rowOfBee][colOfBee] = '.';
                    switch (string) {
                        case "up":
                            rowOfBee--;
                            break;
                        case "down":
                            rowOfBee++;
                            break;
                        case "left":
                            colOfBee--;
                            break;
                        case "right":
                            colOfBee++;
                            break;
                    }

                    if (isInBounds(matrix, rowOfBee, colOfBee)) {
                        if (matrix[rowOfBee][colOfBee] == '.') {
                            matrix[rowOfBee][colOfBee] = 'B';
                        } else if (matrix[rowOfBee][colOfBee] == 'f') {
                            matrix[rowOfBee][colOfBee] = 'B';
                            pollinatedFlowersCount++;
                        }
                    }
                }


            } else {
                lostBee = true;
                System.out.println("The bee got lost!");
                break;
            }




            string = scanner.nextLine();
        }

        if (pollinatedFlowersCount < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", 5 - pollinatedFlowersCount);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n",pollinatedFlowersCount);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }


    public static boolean isInBounds(char[][] matrix, int rows, int cols) {
        if (rows < 0 || rows >= matrix.length || cols < 0 || cols >= matrix[rows].length) {
            return false;
        }
        return true;
    }
}
