package Exercise;

import java.util.Scanner;

public class T04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = 0;
        double sumOfAll = 0;
        int counter = 0;

        while (!input.equals("Finish")) {
            for (int i = 0; i < n; i++) {
                double num = Double.parseDouble(scanner.nextLine());
                sum += num;
                counter++;
                sumOfAll += num;
            }
            System.out.printf("%s - %.2f.\n",input,sum/n*1.0);
            sum = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.",sumOfAll/counter*1.0);
    }


}
