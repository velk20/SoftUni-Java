package T12AlgorithmsFundamentalsWithJava.Recursion;

import java.util.regex.Matcher;

public class BruteForce {
    public static void main(String[] args) {
        //enigma with 5 numbers WITH BRUTEFORCE
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.println(String.format("%d%d%d%d%d", i, j, k, l, m));
                        }
                    }
                }
            }
        }

        System.out.println("Number of operations: " + Math.pow(10, 5));
    }
}
