package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfDNAS = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        


        while (!input.equals("Clone them!")) {
            int[] numbers = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < numbers.length - 1; i++) { //[1,0,1,1,0];[0,1,1,0,0];

                if (numbers[i] == 1 && numbers[i + 1] == 1) {


                }
            }

            input = scanner.nextLine();
        }


    }
}
