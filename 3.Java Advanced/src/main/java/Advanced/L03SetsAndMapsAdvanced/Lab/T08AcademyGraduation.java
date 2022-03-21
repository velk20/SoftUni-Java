package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted =
                        Arrays.stream(scanner.nextLine()
                                        .split("\\s+"))
                                .map(Integer::parseInt)
                                .sorted((e1, e2) -> e2.compareTo(e1))
                                .limit(3)
                                .collect(Collectors.toList());
        for (Integer integer : sorted) {
            System.out.print(integer+" ");
        }


    }
}
