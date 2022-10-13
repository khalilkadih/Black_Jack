public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(Card card) {
        this.suit=card.getSuit();
        this.rank=card.getRank();
    }

    public Suit getSuit() {

        return suit;
    }

    public void setSuit(Suit suit) {

        this.suit = suit;
    }

    public Rank getRank() {

        return rank;
    }

    public void setRank(Rank rank) {

        this.rank = rank;
    }
    public int getValue(){
        return  this.rank.rankValue;
    }


    @Override
    public String toString() {

        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");
      //  return  suit + " "+ rank;
    }
}
