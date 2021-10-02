package L04Methods.Lab;

import java.util.Scanner;

public class T05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    public static void Order(String type, int quantity) {
        double price = 0;
        switch (type) {
            case "coffee":
                price = 1.50;
                break;

                case "water":
                price = 1.00;
                break;

                case "coke":
                price = 1.40;
                break;

                case "snacks":
                price = 2.00;
                break;
        }

        System.out.printf("%.2f",price * quantity);
    }

}

