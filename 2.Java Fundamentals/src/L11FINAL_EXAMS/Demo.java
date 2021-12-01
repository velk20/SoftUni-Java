package L11FINAL_EXAMS;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstSea = Integer.parseInt(input);
        input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("")) {
            int sea = Integer.parseInt(input);
            if (firstSea < sea) {
                counter++;
            }
            firstSea = sea;


            input = scanner.nextLine();
        }
        System.out.println(counter);
    }
}
