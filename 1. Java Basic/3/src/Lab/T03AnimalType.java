package Lab;

import java.util.Scanner;
//          •	dog -> mammal
//        •	crocodile, tortoise, snake -> reptile
//        •	others -> unknown

public class T03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
