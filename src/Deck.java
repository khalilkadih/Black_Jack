import java.util.ArrayList;
import java.util.stream.Collectors;

public class Deck {
    private ArrayList<Cartes> deck;

    public Deck(){

        deck= new ArrayList<Cartes>();
    }
    public void addCard(Cartes card){

        deck.add(card);
    }
    public Deck(boolean makeDeck)
    {
        deck= new ArrayList<Cartes>();
        if(makeDeck){
            for (Symbole suit : Symbole.values()){
                for (Numero rank : Numero.values()){
                    deck.add(new Cartes(suit,rank));
                }
            }
        }
    }
    public Cartes takeCard(){
        Cartes cardToTake =new Cartes(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }
    public void melange(){
        ArrayList<Cartes> melangeCart= new ArrayList<Cartes>();
        while (deck.size()>0){
            int cardtoTirer = (int)(Math.random()*(deck.size()-1));
            melangeCart.add(deck.get(cardtoTirer));
            deck.remove(cardtoTirer);
        }
        deck=melangeCart;
/*
        Collections.shuffle(deck, new Random());
*/}
    public Boolean hasCard(){
       return  deck.size() > 0 ? true : false;
    }
    public void emptyDeck(){
        deck.clear();
    }
    public int cardsLeft(){
        return deck.size();
    }
    public void addCards(ArrayList<Cartes> cartes){

        deck.addAll(cartes);
    }
    public ArrayList<Cartes> getCarte(){
        return deck;
    }
    public void reloadDeckFromDiscard(Deck discard){
        this.addCards(discard.getCarte());
        this.melange();
        discard.emptyDeck();
        System.out.println(" Run Out of Card ,Creating a new deck from discard pile & shuffling deck ");

    }
   public String toString(){
      /*  String output = "";

        //for each Cartes "card" in the deck
        for(Cartes card: deck){
            //add the card and the escape character for a new line
            output += card;
            output += "\n";
        }
        return output;*/
        return deck.stream().map(deck->deck.toString()).collect(Collectors.joining("\n"));
    }
}
