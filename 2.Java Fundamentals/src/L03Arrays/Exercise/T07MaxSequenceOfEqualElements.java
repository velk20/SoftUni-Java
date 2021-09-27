package L03Arrays.Exercise;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class T07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        int winningCounter = 0;

        int number = 0;

        for (int i = 0; i < numbers.length - 1; i++)
        {
            if (numbers[i] == numbers[i+1])
            {
                counter++;
                if (counter > winningCounter)
                {
                    winningCounter = counter;

                    number = numbers[i];
                }
            }
            else
            {
                counter = 0;
            }
        }
        for (int i = 0; i <= winningCounter; i++)
        {
            System.out.printf("%d ",number);
        }
    }
    }

