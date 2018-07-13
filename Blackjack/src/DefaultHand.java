import java.util.ArrayList;
import java.util.List;

public class DefaultHand implements Hand {

    private List<Card> cards = new ArrayList<>();

    @Override
    public List<Card> getCards() {
        return null;
    }

    @Override
    public int getValue() {
        int total = 0;
        for (int i = 0; i < cards.size(); i++) {
            total = total + cards.get(i).getValue();
        }
        return total;
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
