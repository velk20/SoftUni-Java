package Lab.conditionalStatment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 1000.25;
        int an = 10;
        System.out.println(sum);
        System.out.println(an);

        if (an<sum){
            System.out.println("yes");
        }

        String a = "Example";
        String b = a;
        System.out.println(a==b);//true

        int num = Integer.parseInt(scanner.nextLine());
        if (num == 6){
            System.out.println("Excellent");
        }
    }
}
