package L05Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03HouseParty {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[2].equals("going!")) {
                if (!names.contains(input[0])) {
                    names.add(input[0]);
                } else {
                    System.out.printf("%s is already in the list!\n", input[0]);
                }

            } else if (input[2].equals("not")) {
                if (names.contains(input[0])) {
                    names.remove(input[0]);
                } else {
                    System.out.printf("%s is not in the list!\n",input[0]);
                }
            }
        }

        for (String a :
                names) {
            System.out.printf("%s\n", a);
        }
    }
}
