package L05Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            int num = Integer.parseInt(commands[1]);

            switch (commands[0]) {
                case "Add":
                    addItem(numbers,num);
                    break;
                case "Remove":
                    removeItem(numbers,num);
                    break;
                case "RemoveAt":
                    removeAtItem(numbers, num);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    insertItem(numbers,num,index);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }

    private static void insertItem(List<Integer> numbers,int num, int index) {
        numbers.add(index, num);
    }

    private static void removeAtItem(List<Integer> numbers, int num) {
        numbers.remove(num);
    }

    private static void removeItem(List<Integer> numbers,int num) {numbers.remove(Integer.valueOf(num));}

    private static void addItem(List<Integer> numbers,int num) {
        numbers.add(num);
    }
}
