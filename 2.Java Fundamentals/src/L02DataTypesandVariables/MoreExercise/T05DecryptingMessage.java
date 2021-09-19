package L02DataTypesandVariables.MoreExercise;

import java.util.Scanner;

public class T05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        String output = "";
        for (int i = 0; i < times; i++) {
            char a = scanner.nextLine().charAt(0);
            output += "" +  (char)(a + key);
        }
        System.out.println(output);
    }
}
