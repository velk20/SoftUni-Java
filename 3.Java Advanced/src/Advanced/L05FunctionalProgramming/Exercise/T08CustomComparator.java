package Advanced.L05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = (first,second)->{
          //even and odd
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }
          //odd and even
            else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
          //even and even // odd and odd
            else {
                return first.compareTo(second);
            }
        };

        numbers.stream().sorted(comparator).forEach(e->System.out.printf(e+" "));
    }
}
