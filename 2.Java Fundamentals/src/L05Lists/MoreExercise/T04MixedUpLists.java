package L05Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class T04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
List<Integer> list1 =
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

List<Integer> list2 =
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> allList = new ArrayList<>();

        while (!list1.isEmpty() && !list2.isEmpty()) {
            allList.add(list1.get(0));
            allList.add(list2.get(list2.size() - 1));

            list1.remove(0);
            list2.remove(list2.size() - 1);
        }

        if (list1.isEmpty()) {
            int num1 = list2.get(0);
            int num2 = list2.get(1);

            int min = Math.min(num1, num2);
            int max = Math.max(num2, num1);
            List<String> printList = new ArrayList<>();
            for (int i = 0; i < allList.size(); i++) {
                if (allList.get(i) > min && allList.get(i) < max) {
                    printList.add(String.valueOf(allList.get(i)));
                }
            }

            String out = printList.stream().sorted().collect(Collectors.joining(" "));
            System.out.println(out);

        } else {
            int num1 = list1.get(0);
            int num2 = list1.get(1);

            int min = Math.min(num1, num2);
            int max = Math.max(num2, num1);
            List<String> printList = new ArrayList<>();
            for (int i = 0; i < allList.size(); i++) {
                if (allList.get(i) > min && allList.get(i) < max) {
                    printList.add(String.valueOf(allList.get(i)));
                }
            }
            String out = printList.stream().sorted().collect(Collectors.joining(" "));
            System.out.println(out);
        }


    }
}
