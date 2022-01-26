package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class T09UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        String string = scanner.nextLine();

        while (!string.equals("end")) {
            String[] tokens = string.split("\\s+");
             String ip = tokens[0].split("=")[1];
             String message = tokens[1].split("=")[1];
             String user = tokens[2].split("=")[1];

            if (!map.containsKey(user)) {
                map.put(user, new LinkedHashMap<>() {{
                    put(ip, 1);
                }});
            } else {
                Map<String, Integer> integerMap = map.get(user);
                if (!integerMap.containsKey(ip)) {
                    integerMap.put(ip, 1);
                } else {
                    integerMap.put(ip, integerMap.get(ip) + 1);
                }
                map.put(user, integerMap);
            }

            string = scanner.nextLine();
        }

        map.entrySet().stream().forEach(e->{
            System.out.printf("%s: \n", e.getKey());
            Map<String, Integer> map1 = e.getValue();
            int mapSize = map1.size();
            AtomicInteger currentCount = new AtomicInteger(1);
            map1.entrySet().forEach(e1->{
                if (currentCount.get() != mapSize) {
                    System.out.printf("%s => %d, ", e1.getKey(), e1.getValue());
                } else {
                    System.out.printf("%s => %d.\n", e1.getKey(), e1.getValue());
                }
                    currentCount.getAndIncrement();
            });
        });
    }
}
