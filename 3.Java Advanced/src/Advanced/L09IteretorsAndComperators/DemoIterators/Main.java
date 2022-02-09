package Advanced.L09IteretorsAndComperators.DemoIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //колекция ,която може да бъде обходена е "iterable"
        //нещото ,което я обхожда е "iterator"

        GameShop pulsar = new GameShop();
        List<String> games = new ArrayList<>();

        games.add("NBa 2k22");
        games.add("God of war");
        games.add("Fifa 2022");
        games.add("GTA 5");
        games.add("SpiderMan");
        games.add("IronMan");

        pulsar.setGames(games);

        Iterator<String> shopAssistant = pulsar.iterator();


        while (shopAssistant.hasNext()) {
            System.out.println(shopAssistant.next());

        }

    }
}
