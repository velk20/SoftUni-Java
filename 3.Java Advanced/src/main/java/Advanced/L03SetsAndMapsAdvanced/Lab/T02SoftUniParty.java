package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        Set<String> VIPset = new TreeSet<>();

        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                VIPset.add(input);
            } else {
                set.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                VIPset.remove(input);
            } else {
                set.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(set.size() + VIPset.size());
        for (String string : VIPset) {
            System.out.println(string);
        }   for (String string : set) {
            System.out.println(string);
        }
    }
}
