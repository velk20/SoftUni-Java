package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Add":
                    addNumber(numbers,Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    insertNumber(numbers, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "Remove":
                    removenumber(numbers,Integer.parseInt(command[1]));
                    break;
                case "Shift":
                    shiftNumber(numbers,command[1], Integer.parseInt(command[2]));
                    break;

            }

            command = scanner.nextLine().split(" ");
        }

        for (int n :
                numbers) {
            System.out.printf("%d ",n);
        }

    }

    private static void shiftNumber(List<Integer> numbers, String direction, int times) {
        switch (direction) {
            case "left":
                while (times > 0) {

                        int tempItem = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(tempItem);
                        times--;



                }
                break;

            case "right":
                while (times > 0) {
                    int tempItem = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, tempItem);
                    times--;
                }
                break;
        }
    }

    private static void removenumber(List<Integer> numbers, int num) {
        if (num< numbers.size() && num>=0) {
            numbers.remove(num);
        }else System.out.println("Invalid index");
    }

    private static void insertNumber(List<Integer> numbers, int num, int index) {
        if (index<numbers.size() && index>=0) {
            numbers.add(index, num);
        }else System.out.println("Invalid index");
    }

    private static void addNumber(List<Integer> numbers, int parseInt) {
        numbers.add(parseInt);
    }


}
