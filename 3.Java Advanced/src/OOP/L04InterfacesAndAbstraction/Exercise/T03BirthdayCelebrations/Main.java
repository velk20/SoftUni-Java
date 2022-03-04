package OOP.L04InterfacesAndAbstraction.Exercise.T03BirthdayCelebrations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<Birthable> allObjectsBirthdays = new ArrayList<>();
        while (!string.equals("End")) {
            String[] tokens = string.split("\\s+");
            String clazzName = tokens[0];

            if (clazzName.equals("Citizen")) {
                allObjectsBirthdays.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));

            } else if (clazzName.equals("Pet")) {
                allObjectsBirthdays.add(new Pet(tokens[1], tokens[2]));

            }


            string = scanner.nextLine();
        }
        String year = scanner.nextLine();
        allObjectsBirthdays.stream().filter(e -> e.getBirthDate().endsWith(year)).forEach(e -> System.out.println(e.getBirthDate()));
    }
}
