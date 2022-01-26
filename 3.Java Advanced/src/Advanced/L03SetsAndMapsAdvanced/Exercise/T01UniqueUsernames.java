package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextLine());
        }

        for (String string : set) {
            System.out.println(string);
        }
    }
}
