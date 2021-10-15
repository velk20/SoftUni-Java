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
        int halfSize = numbers.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size()-1) ;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));


    }




}
