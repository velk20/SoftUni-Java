package Advanced.L06DefiningClasses.Exercise.T06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = new Trainer(name);
            if (!trainerMap.containsKey(name)) {
                trainerMap.put(name, trainer);
            }
                trainerMap.get(name).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String element = input;
            for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                boolean atLeastOneValidElement = false;
                Trainer trainer = entry.getValue();
                for (Pokemon pokemon : trainer.getPokemons()) {
                    if (pokemon.getElement().equals(element)) {
                        int numberOfBadges = trainer.getNumberOfBadges();
                        trainer.setNumberOfBadges(numberOfBadges + 1);
                        atLeastOneValidElement = true;
                        break;
                    }
                }

                if (!atLeastOneValidElement) {
                    List<Pokemon> pokemons = trainer.getPokemons();
                    for (int i = 0; i < pokemons.size(); i++) {
                        Pokemon pokemon = pokemons.get(i);
                        int health = pokemon.getHealth();
                        if (health - 10 <= 0) {
                            trainer.getPokemons().remove(pokemon);
                            i--;
                        } else {
                            pokemon.setHealth(health - 10);
                        }


                    }
                }
            }
            input = scanner.nextLine();
        }

        trainerMap
                .values()
                .stream()

                .sorted(Comparator.comparing(Trainer::getNumberOfBadges).reversed())
                .forEach(e -> System.out.printf("%s %d %d\n", e.getName(), e.getNumberOfBadges(),
                        e.getPokemons().size()));
    }
}
