package L10MID_EXAMS.MyMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class T02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffee = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            switch (tokens[0]) {
                case "Include":
                    String cafe = tokens[1];
                    coffee.add(cafe);
                    break;
                case "Remove":
                    int numOfCof = Integer.parseInt(tokens[2]);
                    if (coffee.size() >= numOfCof) {
                        if (tokens[1].equals("first")) {
                            while (numOfCof > 0) {
                                coffee.remove(0);
                                numOfCof--;
                            }
                        } else {
                            while (numOfCof > 0) {
                                coffee.remove(coffee.size() - 1);
                                numOfCof--;
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int cafeOne = Integer.parseInt(tokens[1]);
                    int cafeTwo = Integer.parseInt(tokens[2]);
                    if (cafeOne >= 0 && cafeOne < coffee.size() && cafeTwo >= 0 && cafeTwo < coffee.size() && cafeOne != cafeTwo) {
                        String temp = coffee.get(cafeOne);
                        coffee.set(cafeOne, coffee.get(cafeTwo));
                        coffee.set(cafeTwo, temp);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffee);

                    break;
            }
            n--;
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffee));
    }
}
