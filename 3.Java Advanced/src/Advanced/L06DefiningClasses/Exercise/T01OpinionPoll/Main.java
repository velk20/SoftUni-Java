package Advanced.L06DefiningClasses.Exercise.T01OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            persons.add(person);

        }

        persons.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);


    }
}
