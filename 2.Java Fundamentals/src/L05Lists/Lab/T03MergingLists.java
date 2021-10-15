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
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        //mergeTwoLists(firstList, secondList);

        //Lab - teacher
        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }

        //dobavq poslednite elementi ot dulgiq list (ostanalite elementi)
        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }


        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
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

        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }

}
