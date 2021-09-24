package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class  T03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) people / capacity);
        System.out.println(courses);
    }
}
