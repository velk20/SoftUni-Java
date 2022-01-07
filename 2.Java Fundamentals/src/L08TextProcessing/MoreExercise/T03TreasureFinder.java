package L08TextProcessing.MoreExercise;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> strings = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("find")) {
            char[] characters = input.toCharArray();
            int keyLength = 0;
            for (int i = 0; i < characters.length; i++) {
                char currentChar = characters[i];
                characters[i] = (char)(currentChar - keys[keyLength]);
                keyLength++;
                if (keyLength == keys.length) {
                    keyLength = 0;
                }
            }
            String regex = "(\\w*)[&](?<name>\\w+)[&](\\w*)[<](?<location>\\w+)[>](\\w*)";
            Pattern pattern = Pattern.compile(regex);
            input = new String(characters);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String location = matcher.group("location");
                System.out.printf("Found %s at %s\n", name, location);
            }
            input = scanner.nextLine();
        }


    }
}
