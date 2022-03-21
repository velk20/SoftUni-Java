package Advanced.L10EXAMS.JavaAdvancedRetakeExam18August2021;

import java.util.*;

public class T02FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int countOfInputs = Integer.parseInt(scanner.nextLine());

        int rowOfF1 = 0;
        int colOfF1 = 0;

        char[][] matrix = new char[rows][];
        //input matrix
        for (int i = 0; i < rows; i++) {
            char[] row =scanner.nextLine().toCharArray();
            matrix[i] = row;
            for (int j = 0; j < row.length; j++) {

                if (row[j] == 'P') {
                    rowOfF1 = i;
                    colOfF1 = j;
                }
            }
        }

        boolean finished = false;

        for (int i = 0; i < countOfInputs; i++) {
            String direction = scanner.nextLine();

            switch (direction) {
                case "up":
                    matrix[rowOfF1][colOfF1] = '.';
                    rowOfF1--;
                    if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                        if (matrix[rowOfF1][colOfF1] == '.') {
                            matrix[rowOfF1][colOfF1] = 'P';
                        } else if (matrix[rowOfF1][colOfF1] == 'B') {
                            rowOfF1--;
                            if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                                matrix[rowOfF1][colOfF1] = 'P';
                            } else {
                                matrix[rows - 1][colOfF1] = 'P';
                            }

                            if (matrix[rowOfF1][colOfF1] == 'F') {
                                matrix[rowOfF1][colOfF1] = 'P';
                                finished = true;
                                break;
                            }
                        } else if (matrix[rowOfF1][colOfF1] == 'T') {
                            rowOfF1++;
                            matrix[rowOfF1][colOfF1] = 'P';
                        } else if (matrix[rowOfF1][colOfF1] == 'F') {
                            matrix[rowOfF1][colOfF1] = 'P';
                            finished = true;
                            break;
                        }

                    } else {
                        rowOfF1 = rows - 1;
                        matrix[rowOfF1][colOfF1] = 'P';
                    }
                    break;
                case "down":
                    matrix[rowOfF1][colOfF1] = '.';
                    rowOfF1++;

                    if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                        if (matrix[rowOfF1][colOfF1] == '.') {
                            matrix[rowOfF1][colOfF1] = 'P';
                        } else if (matrix[rowOfF1][colOfF1] == 'B') {
                            rowOfF1++;
                            if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                                matrix[rowOfF1][colOfF1] = 'P';
                            } else {
                                matrix[0][colOfF1] = 'P';
                            }

                            if (matrix[rowOfF1][colOfF1] == 'F') {
                                matrix[rowOfF1][colOfF1] = 'P';
                                finished = true;
                                break;
                            }
                        } else if (matrix[rowOfF1][colOfF1] == 'T') {
                            rowOfF1--;
                            matrix[rowOfF1][colOfF1] = 'P';

                        } else if (matrix[rowOfF1][colOfF1] == 'F') {
                            matrix[rowOfF1][colOfF1] = 'P';
                            finished = true;
                            break;
                        }
                    } else {
                        rowOfF1 = 0;
                        matrix[rowOfF1][colOfF1] = 'P';
                    }
                    break;
                case "left":
                    matrix[rowOfF1][colOfF1] = '.';

                    colOfF1--;
                    if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                        if (matrix[rowOfF1][colOfF1] == '.') {
                            matrix[rowOfF1][colOfF1] = 'P';
                        } else if (matrix[rowOfF1][colOfF1] == 'B') {
                            colOfF1--;
                            if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                                matrix[rowOfF1][colOfF1] = 'P';
                            } else {
                                matrix[rowOfF1][rows-1] = 'P';
                            }

                            if (matrix[rowOfF1][colOfF1] == 'F') {
                                matrix[rowOfF1][colOfF1] = 'P';
                                finished = true;
                                break;
                            }
                        } else if (matrix[rowOfF1][colOfF1] == 'T') {
                            colOfF1++;
                            matrix[rowOfF1][colOfF1] = 'P';

                        } else if (matrix[rowOfF1][colOfF1] == 'F') {
                            matrix[rowOfF1][colOfF1] = 'P';
                            finished = true;
                            break;
                        }
                    } else {
                        colOfF1 = rows - 1;
                        matrix[rowOfF1][colOfF1] = 'P';
                    }
                    break;
                case "right":
                    matrix[rowOfF1][colOfF1] = '.';

                    colOfF1++;
                    if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                        if (matrix[rowOfF1][colOfF1] == '.') {
                            matrix[rowOfF1][colOfF1] = 'P';
                        } else if (matrix[rowOfF1][colOfF1] == 'B') {
                            colOfF1++;
                            if (outOfBauns(matrix, rowOfF1, colOfF1)) {
                                matrix[rowOfF1][colOfF1] = 'P';
                            } else {
                                matrix[rowOfF1][0] = 'P';
                            }

                            if (matrix[rowOfF1][colOfF1] == 'F') {
                                matrix[rowOfF1][colOfF1] = 'P';
                                finished = true;
                                break;
                            }
                        } else if (matrix[rowOfF1][colOfF1] == 'T') {
                            colOfF1--;
                            matrix[rowOfF1][colOfF1] = 'P';

                        } else if (matrix[rowOfF1][colOfF1] == 'F') {
                            matrix[rowOfF1][colOfF1] = 'P';
                            finished = true;
                            break;
                        }
                    } else {
                        colOfF1 = 0;
                        matrix[rowOfF1][colOfF1] = 'P';
                    }
                    break;



            }

            if (finished) {
                System.out.println("Well done, the player won first place!");
                printMatrix(matrix);
                break;
            }
        }

        if (!finished) {
            System.out.println("Oh no, the player got lost on the track!");
            printMatrix(matrix);

        }


    }

    public static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static boolean outOfBauns(char[][] matrix, int row, int col) {
        if (matrix.length <= row) {
            //row = 0;
            return false;
        } else if (row < 0) {
            //row = matrix.length - 1;
            return false;

        } else if (matrix[row].length <= col) {
           // col = 0;
            return false;
        } else if (col < 0) {
            //col = matrix[row].length-1;
            return false;

        }
        return true;

    }
}
