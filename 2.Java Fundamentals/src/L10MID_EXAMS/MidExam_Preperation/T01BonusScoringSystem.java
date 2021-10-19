package L10MID_EXAMS.MidExam_Preperation;

import java.util.List;
import java.util.Scanner;

public class T01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonuses = Integer.parseInt(scanner.nextLine());//init...neshto si

        double maxBonus = 0;
        int student = 0;

        for (int i = 0; i < countStudents; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = studentAttendances * 1.0 / countOfLectures * (5 + additionalBonuses);
            if (totalBonus > maxBonus) {
                maxBonus=totalBonus;
                student = studentAttendances;
            }

        }
        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",student);
    }
}
