package Advanced.L10EXAMS.ExamPrep1;


import java.util.*;

public class T02CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rowOfS = 0;
        int colOfS = 0;

        int totalMoney = 0 ;

        char[][] matrix = new char[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'S') {
                    rowOfS= i ;
                    colOfS = j;
                }
            }
        }

        boolean outOfSquare = false;
        boolean enoughMoney = false;

        while (!outOfSquare && !enoughMoney) {

            String input = scanner.nextLine();
            matrix[rowOfS][colOfS] = '-';
            switch (input) {
                case "right":
                    colOfS++;
                    break;
                case "left":
                    colOfS--;
                    break;
                case "up":
                    rowOfS--;
                    break;
                case "down":
                    rowOfS++;
                    break;
            }

            if (!isInBounds(matrix, rowOfS, colOfS)) {
                outOfSquare = true;
                break;
            }

            if (matrix[rowOfS][colOfS] == '-') {
                matrix[rowOfS][colOfS] = 'S';
            } else if (matrix[rowOfS][colOfS] == 'P') {
                matrix[rowOfS][colOfS] = '-';
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == 'P') {
                            rowOfS = i;
                            colOfS = j;
                            matrix[rowOfS][colOfS] = 'S';
                        }
                    }
                }
            } else if (Character.isDigit(matrix[rowOfS][colOfS])) {
                totalMoney += Character.getNumericValue(matrix[rowOfS][colOfS]);
                matrix[rowOfS][colOfS] = 'S';
            }


            if (totalMoney >= 50) {
                enoughMoney = true;
            }

        }

        if (outOfSquare) {
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        if (enoughMoney) {
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
        if (row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col) {
            return true;
        }
        return  false;
    }
}
