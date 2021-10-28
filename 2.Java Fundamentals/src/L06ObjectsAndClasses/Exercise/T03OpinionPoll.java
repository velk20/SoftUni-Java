package L06ObjectsAndClasses.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T03OpinionPoll {
    private static class Person {
       public String name;
        public int age ;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }



        public int getAge() {
            return  age;
        }

        @Override
        public String toString() {
            return this.getName() + " - " + this.getAge();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            //if (person.age > 30) {
                persons.add(person);
           // }
        }
//filter
       persons = persons.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
        persons.sort(Comparator.comparing(Person::getName));//sorting Objects

        for (Person person : persons) {
         //   System.out.println(person.getName() + " - " + person.getAge());
            System.out.println(person.toString());
        }


    }
}
