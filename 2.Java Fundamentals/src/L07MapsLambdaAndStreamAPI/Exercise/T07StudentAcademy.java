package L07MapsLambdaAndStreamAPI.Exercise;

import java.sql.SQLOutput;
import java.util.*;

public class T07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                List<Double> d = new ArrayList<>();
                d.add(grade);
                students.put(name, d);
            } else {
                List<Double> d = students.get(name);
                d.add(grade);
                students.put(name, d);
            }

        }

        Map<String, Double> finale = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            List<Double> doubles = entry.getValue();
            double avg = 0;
            for (Double aDouble : doubles) {
                avg += aDouble;
            }

            avg = avg / doubles.size();
            finale.put(entry.getKey(), avg);
        }

        finale
                .entrySet()
                .stream()
                .filter(e->e.getValue()>=4.50)
                .sorted((e1,e2) -> Double.compare( e2.getValue(),e1.getValue()))
                .forEach(e-> System.out.printf("%s -> %.2f\n",e.getKey(),e.getValue()));

    }
}
