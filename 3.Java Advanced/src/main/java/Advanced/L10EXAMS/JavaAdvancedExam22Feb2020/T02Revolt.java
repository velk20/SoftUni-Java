    package Advanced.L10EXAMS.JavaAdvancedExam22Feb2020;

    import java.util.Scanner;

    public class T02Revolt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean finish = false;

            int n = Integer.parseInt(scanner.nextLine());
            int countCommands = Integer.parseInt(scanner.nextLine());

            int playerRow = 0;
            int playerCol = 0;

            int finishRow = 0;
            int finishCol = 0;

            char[][] matrix = new char[n][];
            for (int i = 0; i < n; i++) {
                char[] arr = scanner.nextLine().toCharArray();
                matrix[i] = arr;
                for (int j = 0; j < arr.length; j++) {
                    if (matrix[i][j] == 'f') {
                        playerRow = i;
                        playerCol = j;
                    }else   if (matrix[i][j] == 'F') {
                        finishRow = i;
                        finishCol = j;
                    }
                }
            }

            for (int i = 0; i < countCommands; i++) {
                String command = scanner.nextLine();

                int oldRow = playerRow;
                int oldCol = playerCol;

                matrix[playerRow][playerCol] = '-';
                switch (command) {
                    case "up":
                        playerRow--;
                        if (playerRow < 0) {
                            playerRow = matrix.length-1;
                        }
                        break;
                    case "down":
                        playerRow++;
                        if (playerRow >= matrix.length) {
                            playerRow = 0;
                        }
                        break;
                    case "left":
                        playerCol--;
                        if (playerCol < 0) {
                            playerCol = matrix.length-1;
                        }
                        break;
                    case "right":
                        playerCol++;
                        if (playerCol >= matrix.length) {
                            playerCol = 0;
                        }
                        break;
                }

                if (matrix[playerRow][playerCol] == 'B') {
                    switch (command) {
                        case "up":
                            playerRow--;
                            if (playerRow < 0) {
                                playerRow = matrix.length-1;
                            }
                            break;
                        case "down":
                            playerRow++;
                            if (playerRow >= matrix.length) {
                                playerRow = 0;
                            }
                            break;
                        case "left":
                            playerCol--;
                            if (playerCol < 0) {
                                playerCol = matrix.length-1;
                            }
                            break;
                        case "right":
                            playerCol++;
                            if (playerCol >= matrix.length) {
                                playerCol = 0;
                            }
                            break;
                    }

                } else if (matrix[playerRow][playerCol] == 'T') {
                    playerRow = oldRow;
                    playerCol = oldCol;
                } else if (matrix[playerRow][playerCol] == 'F') {
                    matrix[playerRow][playerCol] = 'f';

                    finish = true;
                            break;
                } else if (matrix[playerRow][playerCol] == '-') {
                    matrix[playerRow][playerCol] = 'f';

                }

            }
            if (finish) {
                System.out.println("Player won!");
            }else System.out.println("Player lost!");

            for (char[] chars : matrix) {
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println();
            }
        }


    }
