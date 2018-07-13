public class DefaultCard implements Card {

    private CardFace cardFace;
    private Suit suitType;

    public DefaultCard(CardFace cardFace, Suit suitType) {
        this.cardFace = cardFace;
        this.suitType = suitType;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public Suit getSuit() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
