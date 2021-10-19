package L10MID_EXAMS.T03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class T03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);
            switch (tokens[0]) {
                case "Shoot":
                    shootList(integers, index, value);
                    break;
                case "Add":
                    addList(integers, index, value);
                    break;
                case "Strike":
                    strikeList(integers, index, value);
                    break;

            }
            input = scanner.nextLine();
        }
        String out = integers.toString().replaceAll("[\\[\\]]","");
        System.out.println(out.replaceAll(", ","|"));
    }

    private static void strikeList(List<Integer> integers, int index, int value) {
        if (index - value < 0 || index + value >= integers.size()) {
            System.out.println("Strike missed!");
        } else {
            int counter = 0;
            while (counter <= value * 2) {
                integers.remove(index - value);
                counter++;
            }
        }
    }

    private static void addList(List<Integer> integers, int index, int value) {
        if (index >= 0 && index < integers.size()) {
            integers.add(index, value);
        }else System.out.println("Invalid placement!");
    }

    private static void shootList(List<Integer> integers, int index, int value) {
        if (index >= 0 && index < integers.size()) {
            int item = integers.get(index);
            if (item - value <= 0) {
                integers.remove(index);
            } else {
                integers.set(index, item - value);
            }
        }
    }
}
