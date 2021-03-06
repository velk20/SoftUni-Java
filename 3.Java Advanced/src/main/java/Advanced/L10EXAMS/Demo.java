package Advanced.L10EXAMS;

import java.util.*;

public class Demo {
    public static void main(String[] args) {


        //FILL WITH STREAM API
        // Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(daffodilsQueue::offer);
        // Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(tulipsStack::push);

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentsGrades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();

            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.length;
            studentsGrades.putIfAbsent(name, average);
        }
        studentsGrades.forEach((key, value) ->
                System.out.printf("%s is graduated with " + value + "%n", key));
    }
}
