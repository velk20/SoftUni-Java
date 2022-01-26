package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reading set from one line
        LinkedHashSet<Integer> set = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(LinkedHashSet::new));


        //sorting and compare maps
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Georgi", 3);
        students.put("Pesho", 6);
        students.put("Asen", 3);
        students.put("Angel", 3);


        //sortirane samo po ocenki
        students.entrySet().stream().sorted(

                //1->sortira wuzhodqshto (ot nai-malkiq kum nai-golemiq)
                // (leftElement,rightElement) ->{
                //    return leftElement.getValue().compareTo(rightElement.getValue());
               // }

                //2->sortira nizhodqshto (ot nai-golemiq do nai-malkiq)
                (leftElement,rightElement) ->{
                        return rightElement.getValue().compareTo(leftElement.getValue());
                     }

        ).forEach(System.out::println);


        //sortirane i po ocenki i po imena
        students
                .entrySet()
                .stream()
                .sorted(
                (leftElement,rightElement) ->{
                    int result = rightElement.getValue().compareTo(leftElement.getValue());//ocenki v nizhodqsht red!!!

                    if (result==0) { //ako sa ravni elementite togava gi sravni po imena vuv vuzhodqsht red!!!
                        result = leftElement.getKey().compareTo(rightElement.getKey());
                    }
                    return result;
                }

        ).forEach(System.out::println);
    }
}
