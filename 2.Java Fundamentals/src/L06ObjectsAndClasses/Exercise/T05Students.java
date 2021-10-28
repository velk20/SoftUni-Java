package L06ObjectsAndClasses.Exercise;

import javax.security.auth.callback.LanguageCallback;
import java.util.*;

public class T05Students {

    private static class Alah {
        String fName;
        String lName;
        double grade;

        public Alah(String fName, String lName, double grade) {
            this.fName = fName;
            this.lName = lName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.fName,this.lName,this.grade);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Alah> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            Alah student = new Alah(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
            students.add(student);
        }
students.sort(Comparator.comparing(Alah::getGrade).reversed());
        for (Alah student : students) {
            System.out.println(student);
        }


    }
}
