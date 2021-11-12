package L08TextProcessing.MoreExercise;


import java.util.*;

public class T03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> strings = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("find")) {
            for (int i = 0; i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                for (int j = 0; j < keys.length; j++) {

                }
            }


            input = scanner.nextLine();
        }
    }
}
