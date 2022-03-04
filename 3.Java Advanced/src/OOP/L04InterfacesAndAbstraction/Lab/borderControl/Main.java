package OOP.L04InterfacesAndAbstraction.Lab.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> peopleIds = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];
                peopleIds.add(new Robot(model, id));
            } else if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                peopleIds.add(new Citizen(name, age, id));
            }


            input = scanner.nextLine();
        }

        int fakeIdsEnd = Integer.parseInt(scanner.nextLine());

        peopleIds.stream().filter(e -> e.getId().endsWith(String.valueOf(fakeIdsEnd))).forEach(e->System.out.println(e.getId()));
    }
}
