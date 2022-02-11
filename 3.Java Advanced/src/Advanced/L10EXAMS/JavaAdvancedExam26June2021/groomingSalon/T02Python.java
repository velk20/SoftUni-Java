package Advanced.L10EXAMS.JavaAdvancedExam26June2021.groomingSalon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> commands = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        char[][] matrix = new char[n][];

        boolean enemyKilledMe = false;

        int snakeRow = 0;
        int snakeCol = 0;

        int pythonLen = 1;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().replaceAll("\\s","").toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 's') {
                    snakeRow = i;
                    snakeCol = j;
                }
            }
        }


        while (!commands.isEmpty()) {
            String command = commands.get(0);
            commands.remove(0);

            matrix[snakeRow][snakeCol] = '*';

            switch (command) {
                case "right":
                    snakeCol++;
                    if (!(snakeCol<matrix[snakeRow].length)) {
                        snakeCol = 0;
                    }
                    break;

                    case "left":
                        snakeCol--;
                        if (!(snakeCol >= 0)) {
                            snakeCol = matrix[snakeRow].length-1;
                        }
                    break;

                    case "up":
                        snakeRow--;
                        if (!(snakeRow >= 0)) {
                            snakeRow = matrix.length - 1;
                        }
                    break;

                    case "down":
                        snakeRow++;
                        if (!(snakeRow < matrix.length)) {
                            snakeRow = 0;
                        }
                    break;
            }

            if (matrix[snakeRow][snakeCol] == 'f') {
                pythonLen++;
                matrix[snakeRow][snakeCol] = 's';

            } else if (matrix[snakeRow][snakeCol] == 'e') {
                enemyKilledMe = true;
                matrix[snakeRow][snakeCol] = 's';

                break;
            } else {

                matrix[snakeRow][snakeCol] = 's';
            }


        }

        if (enemyKilledMe) {
            System.out.println("You lose! Killed by an enemy!");
        } else {

            int remainFood = 0;

            for (char[] chars : matrix) {
                for (char aChar : chars) {
                    if (aChar=='f') remainFood++;
                }
            }

            if (remainFood == 0) {
                System.out.printf("You win! Final python length is %d", pythonLen);
            } else {
                System.out.printf("You lose! There is still %d food to be eaten.", remainFood);
            }
        }


    }


}
