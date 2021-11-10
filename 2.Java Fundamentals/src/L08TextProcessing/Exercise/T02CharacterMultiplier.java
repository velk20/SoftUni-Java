package L08TextProcessing.Exercise;

import java.util.Scanner;

    public class T02CharacterMultiplier {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] strings = scanner.nextLine().split(" ");

            int total = CharacterMultiplers(strings[0], strings[1]);
            System.out.println(total);

        }

        public static int CharacterMultiplers(String a, String b) {
            int totalSum = 0;

            if (a.length() < b.length()) {
                for (int i = 0; i < a.length(); i++) {
                    char chA = a.charAt(i);
                    char chB = b.charAt(i);
                    totalSum += chA * chB;
                }

                for (int i = a.length(); i < b.length(); i++) {

                    char chB = b.charAt(i);
                    totalSum +=  chB;
                }
            } else if (a.length() > b.length()) {
                for (int i = 0; i < b.length(); i++) {
                    char chA = a.charAt(i);
                    char chB = b.charAt(i);
                    totalSum += chA * chB;
                }

                for (int i = b.length(); i < a.length(); i++) {

                    char chB = a.charAt(i);
                    totalSum += chB;
                }
            } else {
                for (int i = 0; i < b.length(); i++) {
                    char chA = a.charAt(i);
                    char chB = b.charAt(i);
                    totalSum += chA * chB;
                }
            }

        return totalSum;
        }

    }
