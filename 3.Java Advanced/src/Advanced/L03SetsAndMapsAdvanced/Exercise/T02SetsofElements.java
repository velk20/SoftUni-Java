package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T02SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nAndM = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i < nAndM[0]; i++) {
            set1.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < nAndM[1]; i++) {
            set2.add(Integer.parseInt(scanner.nextLine()));
        }


        set1.retainAll(set2); //remove all elements that are not in secondSet
        for (Integer integer : set1) {
            System.out.print(integer+" ");
        }
    }
}
