package Advanced.L10EXAMS;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][];
        String[] commands = scanner.nextLine().split(",");

        int countOfBombs = 0;

        boolean end = false;

        int rowOfSapper = 0;
        int colOfSapper = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine().replaceAll(" ", "");
            char[] arr = input.toCharArray();
            matrix[i] = arr;
            for (int j = 0; j < arr.length; j++) {
                if (matrix[i][j] == 's') {
                    rowOfSapper = i;
                    colOfSapper = j;
                } else if (matrix[i][j] == 'B') {
                    countOfBombs++;
                }
            }
        }

        int index = 0;

        while (!end && countOfBombs > 0 && index< commands.length) {
            matrix[rowOfSapper][colOfSapper] = '+';
            String command = commands[index];
            switch (command) {
                case "left":
                    colOfSapper--;
                    break;
                    case "right":
                        colOfSapper++;
                    break;
                    case "up":
                        rowOfSapper--;
                    break;
                    case "down":
                        rowOfSapper++;
                    break;
            }

            if (isInBounds(matrix, rowOfSapper, colOfSapper)) {
                if (matrix[rowOfSapper][colOfSapper] == 'B') {
                    System.out.println("You found a bomb!");
                    countOfBombs--;
                    matrix[rowOfSapper][colOfSapper] = 's';
                } else if (matrix[rowOfSapper][colOfSapper] == '+') {
                    matrix[rowOfSapper][colOfSapper] = 's';
                } else if (matrix[rowOfSapper][colOfSapper] == 'e') {
                    end = true;
                    break;
                }




            } else {
                switch (command) {
                    case "left":
                        colOfSapper++;
                        break;
                    case "right":
                        colOfSapper--;
                        break;
                    case "up":
                        rowOfSapper++;
                        break;
                    case "down":
                        rowOfSapper--;
                        break;
                }
                matrix[rowOfSapper][colOfSapper] = 's';
            }



            index++;

        }

        if (countOfBombs == 0) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (end && countOfBombs > 0) {
            System.out.printf("END! %d bombs left on the field\n", countOfBombs);
        } else{
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", countOfBombs, rowOfSapper, colOfSapper);
        }



    }

    public  static  boolean isInBounds(char[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
            return true;
        }
        return false;
    }

}
