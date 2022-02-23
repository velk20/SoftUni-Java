package OOP.L01WorkingWithAbstraction.Exercise.T02CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (RankCards value : RankCards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value.toString());
        }

    }
}
