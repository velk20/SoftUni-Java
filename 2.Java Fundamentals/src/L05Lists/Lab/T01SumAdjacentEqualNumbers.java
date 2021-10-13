package L05Lists.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class T01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        //3 3 6 1
        // 6 6 1
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i <numbers.size()-1 ; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i,numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;// trqbva da zapochvame otnachalo
            }

        }

        String output = joinElementsByDelimiter(numbers," ");
        System.out.println(output);

    }

    private static String joinElementsByDelimiter(List<Double> numbers, String s) {
        String output = "";
        for (Double item :
                numbers) {
            output += (new DecimalFormat("0.#").format(item) + s);//"0.#" sluji
            //ako imame 3.0 shte mahne nulata i shte stane 3
            //no ako imame 3.4 shte vurna 3.4
        }
        return output;
    }
}
