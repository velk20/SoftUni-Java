package Advanced.L09IteretorsAndComperators.DemoIterators;

import java.util.Iterator;
import java.util.List;

public class GameShop implements Iterable<String> {
    private List<String> games;

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index <= games.size() - 1;
            }

            @Override
            public String next() {
                String name = games.get(index);
                index++;
                return name;
            }
        };
    }
}
