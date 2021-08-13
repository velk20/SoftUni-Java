package Exercise;

import java.util.Scanner;

public class T06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fb = 150;
        int ins = 100;
        int red = 50;

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < tabs; i++) {

            if (salary > 0) {
                String input = scanner.nextLine();
                if (input.equals("Facebook")) {
                    salary -= fb;
                } else if (input.equals("Instagram")) {
                    salary -= ins;
                } else if (input.equals("Reddit")) {
                    salary -= red;
                }
            } else {
                System.out.println("You have lost your salary." );
                break;            }
        }

        if (salary >0) {
            System.out.println(salary);
        }


    }
}
