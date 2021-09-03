package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            char c = (char) i;
            System.out.printf("%c ",c);
        }
    }
}
