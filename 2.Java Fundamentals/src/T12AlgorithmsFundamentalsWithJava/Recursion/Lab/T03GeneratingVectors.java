package T12AlgorithmsFundamentalsWithJava.Recursion.Lab;

import java.util.Scanner;

public class T03GeneratingVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] vector = new int[n];
        generateVector(vector, 0);
    }

    static void generateVector(int[] arr, int index) {
        if (index == arr.length) {
            printArray(arr);
            return ;
        }

        for (int i = 0; i <= 1; i++) {
            arr[index] = i;
            generateVector(arr, index + 1);
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
}
