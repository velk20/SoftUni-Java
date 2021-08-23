package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        System.out.printf("%s", a + c + b);
    }
}
