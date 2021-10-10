package L05Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split(" ");

        while (!tokens[0].equals("end")) {

            switch (tokens[0]) {
                case "Contains":
                    contains(numbers, Integer.parseInt(tokens[1]));
                    break;
                case "Print":
                    print(numbers, tokens[1]);
                    break;
                case "Get":
                    getSum(numbers);
                    break;
                case "Filter":
                    filterList(numbers, tokens[1], Integer.parseInt(tokens[2]));
                    break;
            }

            tokens = scanner.nextLine().split(" ");
        }
    }

    private static void filterList(List<Integer> numbers, String condition, int num) {
        String output = "";
        switch (condition) {
            case "<":
                for (int n :
                        numbers) {
                    if (n < num) {
                        output += n + " ";
                    }
                }
                break;
            case ">":
                for (int n :
                        numbers) {
                    if (n > num) {
                        output += n + " ";
                    }
                }
                break;
            case "<=":
                for (int n :
                        numbers) {
                    if (n <= num) {
                        output += n + " ";
                    }
                }
                break;
            case ">=":
                for (int n :
                        numbers) {
                    if (n >= num) {
                        output += n + " ";
                    }
                }
                break;

        }
        System.out.println(output);

    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (int n :
                numbers) {
            sum += n;
        }
        System.out.println(sum);
    }

    private static void print(List<Integer> numbers, String token) {
        List<Integer> newList = new ArrayList<>();
        if (token.equals("even")) {
            for (int n :
                    numbers) {
                if (n % 2 == 0) {
                    newList.add(n);
                }
            }
        } else {
            for (int n :
                    numbers) {
                if (n % 2 != 0) {
                    newList.add(n);
                }
            }
        }
        String output = "";
        for (int item :
                newList) {
            output += item+" ";
        }
        System.out.println(output);

    }

    private static void contains(List<Integer> numbers, int num) {

        if (numbers.contains(num))
            System.out.println("Yes");
        else System.out.println("No such number");
    }
}
