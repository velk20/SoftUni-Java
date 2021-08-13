package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n1 = Integer.parseInt(scanner.nextLine());

        int firstStart = n / 1000;
        int secondStart = (n / 100) % 10;
        int thirdStart = (n / 10) % 10;
        int fourthStart = n % 10;

        int firstEnd = n1 / 1000;
        int secondEnd = (n1 / 100) % 10;
        int thirdSEnd = (n1 / 10) % 10;
        int fourthEnd = n1 % 10;

        for (int i = firstStart; i <= firstEnd; i++) {

            for (int j = secondStart; j <= secondEnd; j++) {

                for (int k = thirdStart; k <= thirdSEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 &&l % 2 != 0 ) {

                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }

                    }
                }
            }
        }

        }
    }

