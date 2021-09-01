package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        int counterFreeBelts = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 6 == 0) {
                counterFreeBelts++;
            }
        }

        double finaled = (lightsabers * (Math.ceil(students + (students * 0.1)))
                + (robes * students) + (belts * (students - counterFreeBelts)));

        if (money >= finaled) {
            System.out.printf("The money is enough - it would cost %.2flv.", finaled);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(money - finaled));
        }
    }
}
