package L06ObjectsAndClasses.Exercise;

import java.util.*;

public class T07OrderByAge {
    private static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            Person person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            people.add(person);
            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
