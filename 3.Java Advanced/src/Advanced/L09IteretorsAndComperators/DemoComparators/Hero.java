package Advanced.L09IteretorsAndComperators.DemoComparators;


//klasa hero moje da bude sravnim
public class Hero implements Comparable<Hero> {
    private String name;
    private int power;

    public String getName() {
        return name;
    }

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    //za sujalenie mojem da sravnqvame samo po 1 neshto
    //ako iskame po poveche raboti togava trqbva da izpolzvame Comparator
    @Override
    public int compareTo(Hero otherHero) {
        return this.name.compareTo(otherHero.getName());
    }

}
