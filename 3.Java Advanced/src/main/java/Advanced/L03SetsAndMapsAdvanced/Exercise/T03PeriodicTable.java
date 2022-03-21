package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            set.addAll(Arrays.asList(tokens));

        }

        for (String string : set) {
            System.out.print(string+" ");
        }

    }
}
