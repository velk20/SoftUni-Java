package L05Lists.Lab;

import javax.sound.midi.MidiDevice;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        gaussTrick(numbers);
    }

    private static void gaussTrick(List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<Integer>();
        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size() / 2; i++) {
                int curAdd = numbers.get(i) + numbers.get((numbers.size() - 1) - i);
                newNumbers.add(curAdd);
            }

        } else {
            int middleNumber = numbers.get(numbers.size() / 2);
            for (int i = 0; i < numbers.size() / 2; i++) {
                int curAdd = numbers.get(i) + numbers.get((numbers.size() - 1) - i);
                newNumbers.add(curAdd);
            }
            newNumbers.add(middleNumber);
        }
        System.out.println(joinElementsByDelimiter(newNumbers, " "));
    }
    static String joinElementsByDelimiter
            (List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }


}
