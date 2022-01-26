package Advanced.L05FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> remove = e -> e % n != 0;
        //Predicate<Integer> remove = e -> e % n == 0;
        Collections.reverse(list); //{1,2,3,4,5} -> {5,4,3,2,1}
        //list.removeIf(remove);
        list.stream().filter(remove)
                .forEach(e -> System.out.printf("%d ", e));
    }
}
