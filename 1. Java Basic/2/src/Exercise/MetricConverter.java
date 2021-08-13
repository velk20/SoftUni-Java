package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String metric1 = scanner.nextLine();
        String metric2 = scanner.nextLine();

        if (metric1.equals("mm") && metric2.equals("cm")) {
            double result = num / 10;
            System.out.printf("%.3f",result);
        } else if (metric1.equals("mm") && metric2.equals("m")) {
            double result = num / 1000;
            System.out.printf("%.3f",result);
        }else if (metric1.equals("cm") && metric2.equals("mm")) {
            double result = num *10;
            System.out.printf("%.3f",result);
        }else if (metric1.equals("cm") && metric2.equals("m")) {
            double result = num /100;
            System.out.printf("%.3f",result);
        }else if (metric1.equals("m") && metric2.equals("mm")) {
            double result = num *1000;
            System.out.printf("%.3f",result);
        }else if (metric1.equals("m") && metric2.equals("cm")) {
            double result = num *100;
            System.out.printf("%.3f",result);
        }

    }
}
