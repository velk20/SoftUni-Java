package Lab;

import java.util.Scanner;

public class T05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        double sum = 0;
        String nomoney = "NoMoreMoney";
        String a = "";
        while (true) {

            if (num.equals(nomoney)) {
                break;
            }
            double n = Double.parseDouble(num);
            if (n<0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n",n);
            sum += n;
             num = scanner.nextLine();
        }

        System.out.printf("Total: %.2f\n", sum);

    }
}
