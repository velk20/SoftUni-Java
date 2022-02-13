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

        int counterForAllFood = 0;

        int pythonLen = 1;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().replaceAll("\\s","").toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 's') {
                    snakeRow = i;
                    snakeCol = j;
                } else if (matrix[i][j] == 'f') {
                    counterForAllFood++;
                }
            }
        }


        for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(i);

            matrix[snakeRow][snakeCol] = '*';

            switch (command) {
                case "right":
                    snakeCol++;
                    if (snakeCol>=n) {
                        snakeCol = 0;
                    }
                    break;

                case "left":
                    snakeCol--;
                    if (snakeCol<0) {
                        snakeCol = n - 1;
                    }
                    break;

                case "up":
                    snakeRow--;
                    if (snakeRow<0) {
                        snakeRow = n - 1;
                    }
                    break;

                case "down":
                    snakeRow++;
                    if (snakeRow>=n) {
                        snakeRow = 0;
                    }
                    break;
            }

            if (matrix[snakeRow][snakeCol] == 'f') {
                pythonLen++;
                counterForAllFood--;
                matrix[snakeRow][snakeCol] = 's';

            } else if (matrix[snakeRow][snakeCol] == 'e') {
                enemyKilledMe = true;
                matrix[snakeRow][snakeCol] = 's';
                break;
            }


            matrix[snakeRow][snakeCol] = 's';

            if (counterForAllFood == 0) {
                System.out.printf("You win! Final python length is %d", pythonLen);
                break;
            }

        }

        if (enemyKilledMe) {
            System.out.println("You lose! Killed by an enemy!");
        } else {

            if (counterForAllFood != 0) {
                System.out.printf("You lose! There is still %d food to be eaten.", counterForAllFood);
            }
        }


    }


}
