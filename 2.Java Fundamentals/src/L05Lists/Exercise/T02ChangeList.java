package L05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split(" ");

        while (!tokens[0].equals("end")) {
            switch (tokens[0]) {
                case "Delete":
                    int element = Integer.parseInt(tokens[1]);
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

        for (int n :
                nums) {
            System.out.printf("%d ",n);
        }
    }

    private static void insertItem(List<Integer> nums, int item, int position) {
        nums.add(position, item);
    }

    private static void deleteItem(List<Integer> nums, int removeNum) {
        nums.removeIf(element -> element == removeNum);
    }


}
