package Advanced.L09IteretorsAndComperators.DemoComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();
        Hero firstHero = new Hero("Ben10", 100);
        Hero secondHero = new Hero("SuperMario", 99);
        Hero thirdHero = new Hero("Jax", 120);

        System.out.println(firstHero.compareTo(secondHero));
        //ако върне +1 => firstHero > secondHero
        //ако върне 0 => firstHero == secondHero
        //ако върне -1 => firstHero < secondHero

        heroList.add(firstHero);
        heroList.add(secondHero);
        heroList.add(thirdHero);

        //heroes da gi sortiram po ime i po sila

        //sortira po ime
        Collections.sort(heroList);

        HeroPowerComparator comparator = new HeroPowerComparator();
        System.out.println(comparator.compare(firstHero, secondHero));


        //sortira po power
        Collections.sort(heroList, comparator);
    }
}
