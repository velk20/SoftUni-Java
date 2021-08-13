package Lab;

import java.util.Scanner;
/*
Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        Sofia	5%	7%	8%	12%
        Varna	4.5%	7.5%	10%	13%
        Plovdiv	5.5%	8%	12%	14.5%
*/
public class T12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        double res = 0 ;
        switch (town) {
            case "Sofia":
                if (price >= 0 && price <= 500) {
                    res = price * 0.05;
                    System.out.printf("%.2f",res);
                }else if (price > 500 && price <= 1000) {
                    res = price * 0.07;
                    System.out.printf("%.2f",res);
                }else if (price > 1000 && price <= 10000) {
                    res = price * 0.08;
                    System.out.printf("%.2f",res);
                }else if (price > 10000 ) {
                    res = price * 0.12;
                    System.out.printf("%.2f",res);
                }else System.out.println("error");
                break;
            case "Varna":
                if (price >= 0 && price <= 500) {
                    res = price * 0.045;
                    System.out.printf("%.2f",res);
                }else if (price > 500 && price <= 1000) {
                    res = price * 0.075;
                    System.out.printf("%.2f",res);
                }else if (price > 1000 && price <= 10000) {
                    res = price * 0.10;
                    System.out.printf("%.2f",res);
                }else if (price > 10000 ) {
                    res = price * 0.13;
                    System.out.printf("%.2f",res);
                }else System.out.println("error");
                break;
                case "Plovdiv":
                if (price >= 0 && price <= 500) {
                    res = price * 0.055;
                    System.out.printf("%.2f",res);
                }else if (price > 500 && price <= 1000) {
                    res = price * 0.08;
                    System.out.printf("%.2f",res);
                }else if (price > 1000 && price <= 10000) {
                    res = price * 0.12;
                    System.out.printf("%.2f",res);
                }else if (price > 10000 ) {
                    res = price * 0.145;
                    System.out.printf("%.2f",res);
                }else System.out.println("error");
                break;
            default:
                System.out.println("error");
        }
    }
}
