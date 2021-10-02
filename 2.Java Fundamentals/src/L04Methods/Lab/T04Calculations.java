package L04Methods.Lab;

import javax.imageio.IIOParam;
import java.util.Scanner;

public class T04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int output= calculations(scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()));
        System.out.println(output);
    }

    public static int calculations(String ope, int a, int b) {
        int re = 0;
        switch (ope) {
            case"subtract":
                re= a - b;
            break;

            case "add":
                re= a + b;
            break;

            case "multiply":
                re= a * b;
            break;

            case "divide":
                re= a / b;
            break;
        }
        return  re;
    }
}
