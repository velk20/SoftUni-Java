package L05Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] tokens = scanner.nextLine().split(" ");

        while (!tokens[0].equals("end")) {
            if (tokens.length != 2) {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int item = wagons.get(i);
                    if ((people + item) <= maxCapacity) {
                        wagons.remove(i);
                        wagons.add(i, item + people);
                        break;

                    }
                }
            } else {
                int addPeople = Integer.parseInt(tokens[1]);
                wagons.add(addPeople);

            }

            tokens = scanner.nextLine().split(" ");
        }

        for (int n :
                wagons) {
            System.out.printf("%d ",n);
        }
    }
}
