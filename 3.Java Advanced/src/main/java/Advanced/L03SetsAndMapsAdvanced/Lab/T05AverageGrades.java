package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T05AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>(Arrays.asList(grade)));
            } else {
                students.get(name).add(grade);
            }

        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            List<Double> doubles = entry.getValue();
            System.out.print(entry.getKey()+" -> ");
            for (Double aDouble : doubles) {
                System.out.printf("%.2f ",aDouble);

            }
            double average = doubles.stream().mapToDouble(a->a).average().orElse(0);
            System.out.printf("(avg: %.2f)\n", average);
        }
    }
}
