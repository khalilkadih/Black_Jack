import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hand {
    private ArrayList<Cartes> hand;
    public Hand(){
        hand= new ArrayList<Cartes>();
    }
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.takeCard());
    }
    public Cartes getCard(int index){
        return  hand.get(index);
    }
    public void discardHandToDeck(Deck discardDeck){
    }
    public int calculatedValue(){
        int value=0;
        int aceCount=0;
        for (Cartes card : hand){
            value+=card.getValue();
            if(card.getValue()==11){
                aceCount++;
            }
            if(value>21 && aceCount >0){
                while(aceCount>0 && value>21){
                    aceCount--;
                    value-=10;
                }
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return hand.stream().map(hand->hand.toString()).collect(Collectors.joining("\n"));
    }
}
