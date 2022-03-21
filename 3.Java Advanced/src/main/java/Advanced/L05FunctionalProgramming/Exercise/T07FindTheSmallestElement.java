package Advanced.L05FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class T07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ints = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        //indexOf() - returns first number found
        //lastIndexOf() - returns last number found
        Function<List<Integer>, Integer> findMin = (eList) -> eList.lastIndexOf(Collections.min(ints));

        System.out.println(findMin.apply(ints));
    }
}
