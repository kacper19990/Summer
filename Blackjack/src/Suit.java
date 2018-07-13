public enum Suit {
    DIAMONDS, SPADES, CLUBS, HEARTS;

    private String value;

    private Suit(String value){        //
        this.value = value;             //Assigns one of the values to the value variable
    }

    Suit() {
        
    }

    public String getSuit(){
        return this.value;              //returns what the value variable holds
    }
}
