package L05Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        removeNegativeNumbers(numbers);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }else System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));//tova maha vsichki
        // '[' ; ']' ; ','
    }

    private static void removeNegativeNumbers(List<Integer> numbers) {
            numbers.removeIf(n->n < 0);
    }

}
