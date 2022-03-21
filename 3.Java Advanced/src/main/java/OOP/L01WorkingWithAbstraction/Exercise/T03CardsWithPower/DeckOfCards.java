package OOP.L01WorkingWithAbstraction.Exercise.T03CardsWithPower;

public class DeckOfCards {
    private Cards cards;
    private RankCards rankCards;
    private int totalPower;

    public DeckOfCards(Cards cards, RankCards rankCards) {
        this.cards = cards;
        this.rankCards = rankCards;
        this.totalPower = cards.getPower() + rankCards.getRankPower();
    }

    public int getTotalPower() {
        return totalPower;
    }

    public Cards getCards() {
        return cards;
    }

    public RankCards getRankCards() {
        return rankCards;
    }
}
