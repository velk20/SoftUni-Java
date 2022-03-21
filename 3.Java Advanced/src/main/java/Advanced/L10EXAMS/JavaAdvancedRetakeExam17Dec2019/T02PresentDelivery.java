package Advanced.L10EXAMS.JavaAdvancedRetakeExam17Dec2019;

import java.util.*;
import java.util.stream.Collectors;

public class T02PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPresents = Integer.parseInt(scanner.nextLine());
        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[sizeMatrix][sizeMatrix];

        int santaRow = 0;
        int santaCol = 0;

        int niceKidsCount = 0;


        for (int i = 0; i < sizeMatrix; i++) {
            String[] split = scanner.nextLine().split("\\s+");
            char[] chars = String.join("", split).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                matrix[i][j] = chars[j];
                if (matrix[i][j] == 'S') {
                    santaRow = i;
                    santaCol = j;
                } else if (matrix[i][j] == 'V') {
                    niceKidsCount++;
                }


            }
        }

        int initialCountOfNiceKids = niceKidsCount;

        boolean noMorePresents = false;

        String input = scanner.nextLine();
        while (!input.equals("Christmas morning") || noMorePresents) {
            matrix[santaRow][santaCol] = '-';


            switch (input) {
                case "up":
                    santaRow--;
                    break;
                case "down":
                    santaRow++;
                    break;
                case "left":
                    santaCol--;
                    break;
                case "right":
                    santaCol++;
                    break;
            }
            if (!isInBounds(matrix,santaRow,santaCol))
            {System.out.println("Santa ran out of presents."); break;}

            if (matrix[santaRow][santaCol] == 'V') {
                countOfPresents--;
                niceKidsCount--;
                matrix[santaRow][santaCol] = 'S';
            } else if (matrix[santaRow][santaCol] == 'C') {
                if (matrix[santaRow--][santaCol] == 'V' ||matrix[santaRow--][santaCol] == 'X') {
                    if (matrix[santaRow--][santaCol] == 'V') {
                        niceKidsCount--;
                    }
                    matrix[santaRow--][santaCol] ='-';
                    countOfPresents--;
                } else  if (matrix[santaRow++][santaCol] == 'V' || matrix[santaRow++][santaCol] == 'X') {
                    if (matrix[santaRow--][santaCol] == 'V') {
                        niceKidsCount--;
                    }
                    matrix[santaRow++][santaCol] ='-';
                    countOfPresents--;
                }else  if (matrix[santaRow][santaCol--] == 'V' || matrix[santaRow][santaCol--] == 'X') {
                    if (matrix[santaRow--][santaCol] == 'V') {
                        niceKidsCount--;
                    }
                    matrix[santaRow][santaCol--] ='-';
                    countOfPresents--;
                }else  if (matrix[santaRow][santaCol++] == 'V' || matrix[santaRow][santaCol++] == 'X') {
                    if (matrix[santaRow--][santaCol] == 'V') {
                        niceKidsCount--;
                    }
                    matrix[santaRow][santaCol++] ='-';
                    countOfPresents--;
                }
            } else if (matrix[santaRow][santaCol] == 'X') {
                matrix[santaRow][santaCol] = 'S';
            }

            if (countOfPresents == 0) {
                noMorePresents = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (noMorePresents) {
            System.out.println("Santa ran out of presents!");
        }
        printMatrix(matrix);
        if (niceKidsCount == 0) {
            System.out.printf("Good job, Santa! %d happy nice kid/s.", initialCountOfNiceKids);
        } else {
            System.out.printf("No presents for %d nice kid/s.", niceKidsCount);
        }

    }

    public static boolean isInBounds(char[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col) {
            return  true;
        }
        return false;

    }

    public static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar+" ");
            }
            System.out.println();
        }
    }
}
