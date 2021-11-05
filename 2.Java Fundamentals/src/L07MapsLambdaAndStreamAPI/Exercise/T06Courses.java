package L07MapsLambdaAndStreamAPI.Exercise;

import javax.swing.plaf.ColorUIResource;
import java.util.*;
import java.util.stream.Collectors;

public class T06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> udemy = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] course = input.split(" : ");
            String nameOfCourse = course[0];
            String nameOfStudent = course[1];

            if (!udemy.containsKey(nameOfCourse)) {
               udemy.put(nameOfCourse,new ArrayList<>());
            }

            udemy.get(nameOfCourse).add(nameOfStudent);

            input = scanner.nextLine();
        }


        udemy.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(),e1.getValue().size()))
                //sravnqvame e2 s e1 shtoto gi iskame v nizhodqsh red
        .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                }



        );


    }
}
