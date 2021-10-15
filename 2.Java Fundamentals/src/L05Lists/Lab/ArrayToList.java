package L05Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numArr = new Integer[]{1, 2, 3, 4, 5, 6};
        List<Integer> numList = Arrays.asList(numArr);

    }
}
