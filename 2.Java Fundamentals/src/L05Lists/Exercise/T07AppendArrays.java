package L05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(nums);
        String toPrint = nums.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");
        System.out.println(toPrint);
    }
}

