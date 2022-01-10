package L09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class T02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());

        Map<String, Integer> participants = new LinkedHashMap<>();
        Map<String, Integer> orderedParticipants = new LinkedHashMap<>();

        String regexNames = "[A-Za-z]";
        String regexDistance = "[0-9]";
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            Pattern patternName = Pattern.compile(regexNames);
            Matcher matcherName = patternName.matcher(input);

            StringBuilder name = new StringBuilder();
            while (matcherName.find()) {
                name.append(matcherName.group());
            }
            int distance = 0;
            if (names.contains(name.toString())) {
                Pattern patternDistance = Pattern.compile(regexDistance);
                Matcher matcherDistance= patternDistance.matcher(input);

                while (matcherDistance.find()) {
                    distance += Integer.parseInt(matcherDistance.group());
                }
                if (participants.containsKey(name.toString())) {
                    participants.put(name.toString(), participants.get(name.toString()) +distance);
                } else {
                    participants.put(name.toString(), distance);

                }
            }


            input = scanner.nextLine();
        }

        participants.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                forEachOrdered(x -> orderedParticipants.put(x.getKey(), x.getValue()));

        List<String> orderNames = new ArrayList<>(orderedParticipants.keySet());
        System.out.printf("1st place: %s\n", orderNames.get(0));
        System.out.printf("2nd place: %s\n", orderNames.get(1));
        System.out.printf("3rd place: %s\n", orderNames.get(2));

    }
}
