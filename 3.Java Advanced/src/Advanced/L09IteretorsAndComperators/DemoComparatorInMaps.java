package Advanced.L09IteretorsAndComperators;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoComparatorInMaps {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Gosho", 2.56);
        studentGrades.put("Pesho", 3.56);
        studentGrades.put("Angel", 4.56);
        studentGrades.put("Elena", 2.16);
        studentGrades.put("Petur", 2.26);

        AtomicInteger numberOfStudents = new AtomicInteger();
        studentGrades.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(e ->
                System.out.printf("Student #%d is %s - %.2f\n",numberOfStudents.getAndIncrement()+1, e.getKey(),
                        e.getValue())
        );



    }
}
