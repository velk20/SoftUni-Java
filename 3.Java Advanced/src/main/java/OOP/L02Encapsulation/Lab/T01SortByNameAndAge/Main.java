package OOP.L02Encapsulation.Lab.T01SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfReader = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfReader; i++) {
            String[] input = reader.readLine().split("\\s+");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int comparisonResult = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
//
//            if (comparisonResult == 0) {
//                comparisonResult = Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//
//            return comparisonResult;

            //if they are not equal
            if (comparisonResult != 0) {
                return comparisonResult;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

}
