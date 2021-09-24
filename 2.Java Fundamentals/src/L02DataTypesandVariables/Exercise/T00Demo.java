package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = 'a';
        int a = c;
        int b = Character.getNumericValue(c);
        System.out.println(a + " " + b);


    }
}
