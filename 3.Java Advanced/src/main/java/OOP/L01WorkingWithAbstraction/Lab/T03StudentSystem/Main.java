package OOP.L01WorkingWithAbstraction.Lab.T03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String[] inputArguments = scanner.nextLine().split(" ");
        while (!inputArguments[0].equals("Exit")) {
            studentSystem.ParseCommand(inputArguments);
            inputArguments = scanner.nextLine().split(" ");
        }
    }
}
