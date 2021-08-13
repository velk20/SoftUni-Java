package IzpitniZadachi;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double B = Double.parseDouble(scanner.nextLine());
        double K = Double.parseDouble(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());

        B = B*1168;
        K=K*0.15*1.76;
        M=(B+K)-(B+K)*M/100;

        System.out.println(M/1.95);
    }
}
