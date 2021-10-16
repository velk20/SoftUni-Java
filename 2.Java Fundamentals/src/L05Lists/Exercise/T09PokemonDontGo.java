package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int totalSum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int removedElement;

            if (index < 0) {
                index = 0;
                int lastElement = pokemons.get(pokemons.size()-1);
                removedElement = pokemons.get(index);
                pokemons.set(index, lastElement);
            } else if (index >= pokemons.size()) {
                index = pokemons.size() - 1;
                removedElement = pokemons.get(index);
                pokemons.set(index, pokemons.get(0));
            } else {
                removedElement = pokemons.get(index);
                pokemons.remove(index);
            }

            totalSum += removedElement;

            for (int i = 0; i < pokemons.size() ; i++) {
                int element = pokemons.get(i);

                if (element <= removedElement) {
                    pokemons.set(i, element + removedElement);

                } else {
                    pokemons.set(i, element - removedElement);
                }
            }
        }

        System.out.println(totalSum);

    }
}
