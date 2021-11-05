package L07MapsLambdaAndStreamAPI;

import java.util.*;


public class T02SortingMap {
    public static void main(String[] args) {

        //Map with value list -> sorting by count of list elements
        Map<String, List<String>> map = new HashMap<>();
        map
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(pair -> {
                    System.out.println(pair.getKey());
                    pair.getValue().forEach(el -> System.out.println(el));
                });

    }
}
