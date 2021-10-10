package L05Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList =
                Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        mergeTwoLists(firstList, secondList);
    }

    private static void mergeTwoLists(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> mergedList = new ArrayList<>();
        if (firstList.size() >= secondList.size()) {
            while (!secondList.isEmpty()) {

                if (mergedList.size() % 2 == 0) {
                    mergedList.add(firstList.get(0));
                    firstList.remove(0);
                } else {
                    mergedList.add(secondList.get(0));
                    secondList.remove(0);
                }
            }



            for (int i = 0; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
            }
        } else {
            while (!firstList.isEmpty()) {

                if (mergedList.size() % 2 == 0) {
                    mergedList.add(firstList.get(0));
                    firstList.remove(0);
                } else {
                    mergedList.add(secondList.get(0));
                    secondList.remove(0);
                }
            }

            for (int i = 0; i < secondList.size(); i++) {
                mergedList.add(secondList.get(i));
            }
        }

        System.out.println(outputNumbers(mergedList," "));
    }


    public static String outputNumbers(List<Integer> numbers, String delimiter) {
        String output = "";
        for (Integer item :
                numbers) {
            output += item + delimiter;
        }
        return output;
    }


}
