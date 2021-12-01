package T12AlgorithmsFundamentalsWithJava.Recursion;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class MazeSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] labyrinth = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            labyrinth[row] = scanner.nextLine().toCharArray();

        }

        findPath(labyrinth, 0, 0,' ');
    }

    private static void findPath(char[][] labyrinth, int row, int col,char direction) {
        if (!isInBounds(labyrinth, row, col) || labyrinth[row][col] == 'V') {

            return;
        }

        labyrinth[row][col] = 'V';
        findPath(labyrinth, row - 1, col,'U');
        findPath(labyrinth, row + 1, col,'D');
        findPath(labyrinth, row, col - 1,'L');
        findPath(labyrinth, row, col + 1,'R');
    }

    private static boolean isInBounds(char[][] labyrinth, int row, int col) {
        return row < labyrinth.length && row >= 0 && col < labyrinth[row].length && col >= 0;
    }
}
