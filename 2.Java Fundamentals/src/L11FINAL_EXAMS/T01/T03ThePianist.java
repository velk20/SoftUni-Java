package L11FINAL_EXAMS.T01;

import java.util.*;

public class T03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pianists = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            List<String> innerList = new ArrayList<>();
            innerList.add(input[1]);
            innerList.add(input[2]);
            pianists.put(input[0], innerList);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] tokens = command.split("\\|");
            String com = tokens[0];
            String piece = tokens[1];

            switch (com) {
                case "Add":
                    String composer = tokens[2];
                    String key = tokens[3];
                    if (!pianists.containsKey(piece)) {
                        List<String>newList = new ArrayList<>();
                        newList.add(composer);
                        newList.add(key);

                        pianists.put(piece, newList);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    } else {

                        System.out.printf("%s is already in the collection!\n", piece);
                    }

                    break;


                case "Remove":
                    if (!pianists.containsKey(piece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    } else {
                        pianists.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    }
                    break;


                case "ChangeKey":
                    String newKey = tokens[2];
                    if (pianists.containsKey(piece)) {
                        List<String> newList = pianists.get(piece);
                        newList.remove(1);
                        newList.add(newKey);

                        System.out.printf("Changed the key of %s to %s!\n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece);
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        pianists.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(kvp -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));

    }
}
