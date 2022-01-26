package Advanced.L05FunctionalProgramming.Lab;

import com.sun.source.tree.IfTree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class T5FilterbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(", ");
            map.put(a[0], Integer.parseInt(a[1]));
        }


        String condition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> olderOrNot = e -> e > ageFilter;
        Predicate<Integer> stringPredicate = (i)-> {
            if (condition.equals("older")) {
                return olderOrNot.test(i);
            } else {
                return !olderOrNot.test(i);
            }
        };

        BiConsumer<String,Map.Entry<String,Integer>> printer = (e,entry)->{
            if (e.equals("name age")) {
                System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
            } else if (e.equals("name")) {
                System.out.printf("%s\n", entry.getKey());
            } else {
                System.out.printf("%d\n", entry.getValue());

            }
        };

        map.entrySet()
                .stream()
                .filter(e1 -> stringPredicate.test(e1.getValue()))
                .forEach(e1->printer.accept(format,e1));


    }
}
