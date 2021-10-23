package L10MID_EXAMS.T06;

import java.util.*;
import java.util.stream.Collectors;

public class T02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] tokens = input.split(" ", 2);
            switch (tokens[0]) {
                case "Loot":
                    String[] items = tokens[1].split(" ");
                    for (String e :
                            items) {
                        if (!loot.contains(e)) {
                            loot.add(0, e);
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < loot.size()) {
                        String a = loot.get(index);
                        loot.remove(a);
                        loot.add(a);
                    }
                    break;

                case "Steal":
                    List<String> output = new ArrayList<>();
                    int count = Integer.parseInt(tokens[1]);
                    if (count >= loot.size()) {
                        output.addAll(loot);
                        loot.clear();
                        System.out.println(String.join(", ", output));
                        output.clear();
                        break;
                    } else {

                        for (int i = loot.size() - 1; i >= 0; i--) {
                            output.add(loot.get(i));
                            loot.remove(i);
                            count--;
                            if (count==0){
                                Collections.reverse(output);
                                System.out.println(String.join(", ", output));
                                output.clear();
                                break;
                            }
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        if (loot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
            return;
        } else {
            int sum = 0;

            for (int i = 0; i < loot.size(); i++) {
                sum += loot.get(i).length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", sum * 1.0 / loot.size());
        }

    }

}
