package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T08HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String[] nameAndCards = input.split(": ");
            String name = nameAndCards[0];
            String[] cards = nameAndCards[1].split(", ");

            if (!map.containsKey(name)) {
                map.put(name, new HashSet<>() {{
                    addAll(Arrays.asList(cards));
                }});

            } else {
                Set<String> set = map.get(name);
                set.addAll(Arrays.asList(cards));
                map.put(name, set);
            }

            input = scanner.nextLine();
        }

        map.entrySet().stream().forEach(e->{
            System.out.print(e.getKey()+": ");
            Map<String,Integer> powerOfCards = getPowerOfCards();

            Set<String> set = e.getValue();
            int sum = 0;
            for (String string : set) {
                if (string.charAt(0) == '1' && string.charAt(1) == '0') {
                    int power = powerOfCards.get("10");
                    int type = powerOfCards.get(string.charAt(2) + "");
                    sum += power * type;
                } else {
                    int power = powerOfCards.get(string.charAt(0)+"");
                    int type = powerOfCards.get(string.charAt(1) + "");
                    sum += power * type;

                }
            }
            System.out.printf("%d\n", sum);
        });
    }

    private static Map<String, Integer> getPowerOfCards() {
        return new LinkedHashMap<>(){{
            put("2",2);
            put("3",3);
            put("4",4);
            put("5",5);
            put("6",6);
            put("7",7);
            put("8",8);
            put("9",9);
            put("10",10);
            put("J",11);
            put("Q",12);
            put("K",13);
            put("A",14);
            put("S",4);
            put("H",3);
            put("D",2);
            put("C",1);
        }};
    }
}
