package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T01SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxPen = Integer.parseInt(scanner.nextLine());
        int boxMarker = Integer.parseInt(scanner.nextLine());
        double literPreparat = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pen = boxPen * 5.80;
        double mark = boxMarker * 7.20;
        double preparat = literPreparat * 1.20;
        double sum = pen + mark + preparat;

        System.out.printf("%.3f", sum - (sum * discount / 100));
    }
}
