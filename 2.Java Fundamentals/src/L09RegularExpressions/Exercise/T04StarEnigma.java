package L09RegularExpressions.Exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "@(?<planet>[A-Z]?[a-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<aOrD>[AD])" +
                "![^@\\-!:>]*->(?<count>\\d+)";
        List<String> attackedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int countOFStar = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 's' ||
                    input.charAt(j) == 'S' ||
                    input.charAt(j) == 'T' ||
                    input.charAt(j) == 't' ||
                    input.charAt(j) == 'A' ||
                    input.charAt(j) == 'a' ||
                    input.charAt(j) == 'r' ||
                    input.charAt(j) == 'R') {

                    countOFStar++;
                }
            }
            StringBuilder newInput = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                int newCH = (int)ch - countOFStar;
                newInput.append((char)newCH);
            }

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(newInput.toString());

            if (matcher.find()) {
                String namePlanet = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String attackOrDefense = matcher.group("aOrD");
                int soldiers = Integer.parseInt(matcher.group("count"));
                if (attackOrDefense.equals("A")) {
                    attackedPlanets.add(namePlanet);

                } else destroyedPlanets.add(namePlanet);
            }
        }

        if (attackedPlanets.isEmpty()) {
            System.out.println("Attacked planets: 0");
        } else {
            Collections.sort(attackedPlanets);
            System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
            for (String attackedPlanet : attackedPlanets) {
                System.out.println("-> " + attackedPlanet);
            }
        }

        if (destroyedPlanets.isEmpty()) {
            System.out.println("Destroyed planets: 0");
        } else {
            Collections.sort(destroyedPlanets);
            System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
            for (String destroy : destroyedPlanets) {
                System.out.println("-> " + destroy);
            }
        }

    }
}
