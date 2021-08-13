package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceChild = priceAdult * 0.3;
        priceAdult += tax;
        priceChild += tax;
        double allPrice = (adultTickets * priceAdult) + (childTickets * priceChild);
        double Intace = allPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,Intace);

    }
}