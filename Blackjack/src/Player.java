public class Player {

    DefaultHand hand;

    public Player(){
        this.hand = new DefaultHand();
    }

    public Hand getHand(){
        return hand;
    }

    public void addCard(Card card){
        this.hand.addCard(card);
    }
}
