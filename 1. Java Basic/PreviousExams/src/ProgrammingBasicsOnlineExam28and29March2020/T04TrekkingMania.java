package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMan = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        double sumOfpeople = 0;
        for (int i = 0; i < countMan; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sumOfpeople += people;
            if (people <= 5) {
                musala+=people;
            } else if (people >= 6 && people <= 12) {
                monblan+=people;
            } else if (people >= 13 && people <= 25) {
                kilimandjaro+=people;
            } else if (people >= 26 && people <= 40) {
                k2+=people;
            } else if (people >= 41) {
                everest+=people;
            }

        }
        double m = musala / sumOfpeople * 100.0;
        double n = monblan / sumOfpeople * 100.0;
        double b = kilimandjaro / sumOfpeople * 100.0;
        double v = k2 / sumOfpeople * 100.0;
        double c = everest / sumOfpeople * 100.0;
        System.out.printf("%.2f%%\n",m);
        System.out.printf("%.2f%%\n",n);
        System.out.printf("%.2f%%\n",b);
        System.out.printf("%.2f%%\n",v);
        System.out.printf("%.2f%%",c);

    }
}
