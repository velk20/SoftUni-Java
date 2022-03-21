package Advanced.L09IteretorsAndComperators.DemoComparators;

import java.util.Comparator;

public class HeroPowerComparator implements Comparator<Hero> {//sravnqva

    @Override
    public int compare(Hero o1, Hero o2) {
        return Integer.compare(o1.getPower(), o2.getPower());
    }
}
