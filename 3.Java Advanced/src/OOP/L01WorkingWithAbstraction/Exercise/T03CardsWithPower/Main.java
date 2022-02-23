package OOP.L01WorkingWithAbstraction.Exercise.T03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String card = scanner.nextLine();

        DeckOfCards deckOfCards = new DeckOfCards(Cards.valueOf(card), RankCards.valueOf(rank));
        System.out.printf("Card name: %s of %s; Card power: %d",
                deckOfCards.getRankCards(),deckOfCards.getCards(),deckOfCards.getTotalPower());
    }
}
