package Exercise;

import java.util.Scanner;

public class T04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count200 = 0;
        int count399 = 0;
        int count599 = 0;
        int count799 = 0;
        int count800 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                count200++;
            } else if (num >= 200 && num <= 399) {
                count399++;
            } else if (num >= 400 && num <= 599) {
                count599++;
            } else if (num >= 600 && num <= 799) {
                count799++;
            } else if (num >= 800) {
                count800++;
            }
        }

        System.out.printf("%.2f%%\n", (double)count200 / n * 100.0);
        System.out.printf("%.2f%%\n", (double)count399 / n * 100.0);
        System.out.printf("%.2f%%\n", (double)count599 / n * 100.0);
        System.out.printf("%.2f%%\n", (double)count799 / n * 100.0);
        System.out.printf("%.2f%%", (double)count800 / n * 100.0);
    }
}
