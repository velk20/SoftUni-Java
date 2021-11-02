package L07MapsLambdaAndStreamAPI.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> duplicates = new TreeMap<>();

        for (double aDouble : nums) {
            if (!duplicates.containsKey(aDouble)) {
                duplicates.put(aDouble, 1);
            } else {
                duplicates.put(aDouble,duplicates.get(aDouble)+1);
            }
        }
        for (Map.Entry<Double, Integer> entry : duplicates.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %s\n",df.format(entry.getKey()),entry.getValue()+"");
        }

    }
}
