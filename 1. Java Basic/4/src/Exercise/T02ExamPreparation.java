package Exercise;

import java.util.Scanner;

public class T02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fails = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int countFails = 0;
        int countTasks=0;
        String lastTask = "";
        while (!task.equals("Enough")) {

            if (grade <= 4) {
                countFails++;
            }
            if (countFails == fails) {
                System.out.printf("You need a break, %d poor grades.",fails);
                break;
            }
            sum += grade;
            countTasks++;
            lastTask = task;
            task = scanner.nextLine();
            if (task.equals("Enough")) {
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }
        if (countFails != fails) {
            System.out.printf("Average score: %.2f\n",(double)sum/countTasks);
            System.out.printf("Number of problems: %d\n",countTasks);
            System.out.printf("Last problem: %s",lastTask);
        }

    }
}
