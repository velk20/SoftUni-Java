package L07MapsLambdaAndStreamAPI.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        nums.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(s-> {
            System.out.print(s);
            System.out.print(" ");
        });
    }
}
