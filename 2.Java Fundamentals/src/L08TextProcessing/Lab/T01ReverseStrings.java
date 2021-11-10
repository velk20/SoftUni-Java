package L08TextProcessing.Lab;

import java.util.Scanner;

public class T01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder reverse = new StringBuilder();

            for (int i = input.length()-1; i >=0 ; i--) {
                reverse.append(input.charAt(i));
            }
            System.out.println(input+" = "+reverse);
            input = scanner.nextLine();
        }
    }
}
