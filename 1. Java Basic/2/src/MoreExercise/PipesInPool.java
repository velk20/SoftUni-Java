package MoreExercise;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double first = P1 * H;
        double second = P2 * H;
        double res = first + second;
        if (res <= V) {
            double full = res / V * 100;
            double pipe1 = first / res * 100;
            double pipe2 = second / res * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", full, pipe1, pipe2);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,res-V);
        }
    }
}
