package MoreExercise;

import java.util.Scanner;

public class T03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int cCount = 0;
        int oCount = 0;
        int nCount = 0;
        int secretWordCount = 0;
        Boolean isFirstSecretLetter = false;
        String word = "";
        while (!input.equals("End")) {
            char letter  = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if (letter == 'c' && cCount < 1)
                {
                    cCount++;
                    secretWordCount++;
                    isFirstSecretLetter = true;
                }
                else if (letter == 'o' && oCount < 1)
                {
                    oCount++;
                    secretWordCount++;
                    isFirstSecretLetter = true;
                }
                else if (letter == 'n' && nCount < 1)
                {
                    nCount++;
                    secretWordCount++;
                    isFirstSecretLetter = true;
                }
                if (secretWordCount == 3)
                {
                    System.out.printf("%s ",word);
                    secretWordCount = 0;
                    cCount = 0;
                    oCount = 0;
                    nCount = 0;
                    word = "";
                }
                else if (isFirstSecretLetter == false)
                {
                    word += letter;
                }
                isFirstSecretLetter = false;
            }

            input = scanner.nextLine();

        }
        if (input == "End" && secretWordCount == 3)
        {
            System.out.println(word);
        }
    }
}
