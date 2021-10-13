package L05Lists.Exercise;

import java.util.*;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer> nums = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        nums.remove(2); //priema go kato indeks
        nums.remove(Integer.valueOf(40)); // veche go priema kato chislo
        int[] numdsas = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
