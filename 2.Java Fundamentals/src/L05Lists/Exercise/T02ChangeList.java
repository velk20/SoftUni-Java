package L05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split("\\s+");

        while (!tokens[0].equals("end")) {
            switch (tokens[0]) {
                case "Delete":
                    int element = Integer.parseInt(tokens[1]);
                   // nums.removeAll(Arrays.asList(element));

                    deleteItem(nums, element);
                    break;
                case "Insert":
                    int item = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);
                    insertItem(nums, item, position);
                    break;
            }

            tokens = scanner.nextLine().split(" ");
        }
        //printing
        System.out.println(nums.toString().replaceAll("[\\[\\],]",""));

    }

    private static void insertItem(List<Integer> nums, int item, int position) {
        nums.add(position, item);
    }

    private static void deleteItem(List<Integer> nums, int removeNum) {
        nums.removeIf(e -> e == removeNum);
        // nums.removeAll(Arrays.asList(removeNum));
    }
}
