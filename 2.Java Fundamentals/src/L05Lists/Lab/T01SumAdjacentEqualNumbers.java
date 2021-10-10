package L05Lists.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class T01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i <numbers.size()-1 ; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i,numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i=-1;
            }

        }

        String output = joinElementsByDelimiter(numbers," ");
        System.out.println(output);

    }

    private static String joinElementsByDelimiter(List<Double> numbers, String s) {
        String output = "";
        for (Double item :
                numbers) {
            output += (new DecimalFormat("0.#").format(item) + s);
        }
        return output;
    }
}
