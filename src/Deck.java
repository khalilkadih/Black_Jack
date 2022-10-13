import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){

        deck= new ArrayList<Card>();
    }
    public void addCard(Card card){

        deck.add(card);
    }
    public Deck (boolean makeDeck)
    {
        deck= new ArrayList<Card>();
        if(makeDeck){
            for (Suit suit : Suit.values()){
                for (Rank rank : Rank.values()){
                    deck.add(new Card(suit,rank));
                }
            }
        }
    }

    public Card takeCard(){
        Card cardToTake =new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }
    public void shuffle(){
        ArrayList<Card> shuffled= new ArrayList<Card>();
        while (deck.size()>0){
            int cardToPull = (int)(Math.random()*(deck.size()-1));
            shuffled.add(deck.get(cardToPull));
            deck.remove(cardToPull);
        }
        deck=shuffled;
/*
        Collections.shuffle(deck, new Random());
*/

    }






   public String toString(){

      /*  String output = "";

        //for each Card "card" in the deck
        for(Card card: deck){
            //add the card and the escape character for a new line
            output += card;
            output += "\n";
        }
        return output;*/
        return deck.stream().map(deck->deck.toString()).collect(Collectors.joining("\n"));
    }

}
