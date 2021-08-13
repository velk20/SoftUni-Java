package Exercise;

import java.util.Scanner;

public class T06SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String out = "";
        for (int i = 1111; i <= 9999 ; i++) {
            String currentNum = "" + i;
            for (int j = 0; j < 4; j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (currentDigit != 0) {
                    if (n % currentDigit == 0) {
                        out += currentDigit;
                    }
                }
            }
            if (out.length() == 4) {
                System.out.printf("%s ", out);
                out = "";
            } else {
                out = "";
            }
        }
    }
}
