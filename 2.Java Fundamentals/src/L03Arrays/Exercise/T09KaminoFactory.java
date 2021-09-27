package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfDNAS = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] biggestDNAOfones = new int[lengthOfDNAS];
        int biggestCounterInDna = 0;
        int startIndexOfBiggestSubsequence = -1;

        while (!input.equals("Clone them!")) {
            int[] numbers = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();
            int counterOfOnesInCurrentDNA = 0;
            for (int i = 0; i < numbers.length - 1; i++) { //[1,0,1,1,0];[0,1,1,0,0];[1,1,1,0,0,1,1,1,1,1]
                if (numbers[i] == 1 && numbers[i + 1] == 1) {
                    counterOfOnesInCurrentDNA++;

                    if (startIndexOfBiggestSubsequence > i) {

                    }
                    if (counterOfOnesInCurrentDNA>biggestCounterInDna) {
                        biggestCounterInDna = counterOfOnesInCurrentDNA;
                        biggestDNAOfones = numbers;

                    }
                } else counterOfOnesInCurrentDNA = 0;
            }

            input = scanner.nextLine();
        }
        for (int e :
                biggestDNAOfones) {
            System.out.printf("%d ", e);
        }
        System.out.println();
        System.out.println(biggestCounterInDna+1);
        System.out.println();

    }
}
