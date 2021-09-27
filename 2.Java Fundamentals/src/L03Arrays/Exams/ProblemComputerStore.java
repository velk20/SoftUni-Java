package L03Arrays.Exams;

import java.util.Scanner;

public class ProblemComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0.0;
        while (true) {
            if (input.equals("special") || input.equals("regular")) {
                break;
            } else {

                double price = Double.parseDouble(input);
                if (price < 0) {
                    System.out.println("Invalid price!");

                } else {
                    total += price;

                }
            }


            input = scanner.nextLine();
        }

        if (total == 0) {
            System.out.println("Invalid order!");

        } else {
            double withTaxes = total+total * 0.2;
            if (input.equals("special")) {
                withTaxes = withTaxes * 0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", total);
            System.out.printf("Taxes: %.2f$\n", total * 0.2);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",withTaxes);
        }
    }
}
