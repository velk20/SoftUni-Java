package Lab;

import java.util.Scanner;

public class T06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            char n = a.charAt(i);
            int q = Character.compare(n, 'a');
            int w = Character.compare(n, 'e');
            int e =Character.compare(n, 'i');
            int o =Character.compare(n, 'o');
            int u = Character.compare(n, 'u');
            if (q==0) {
                sum += 1;
            } else if (w==0) {
                sum += 2;
            } else if (e==0) {
                sum += 3;
            } else if (o==0) {
                sum += 4;
            } else if (u==0) {
                sum += 5;
            }

        }
        System.out.println(sum);
    }
}
