public class Main {
    public static void main(String[] args) {

        System.out.println("======================   Welcome to BlackJack! ===================== ");
        System.out.println("======================                         ===================== ");
        System.out.println("======================                         ===================== ");
        System.out.println("\n");

        Game blackjack  = new Game();
        //blackjack.setWins(2);
        //System.out.println(Suit.CLUB);
        //System.out.println(Rank.ACE +" has value of "+Rank.ACE.rankNme);
       // System.out.println(Rank.ACE);
/*        Card card = new Card(Suit.DIAMOND,Rank.ACE);
        Card card2 = new Card(Suit.SPADE,Rank.FOUR);
        Card card3 = new Card(Suit.HEART,Rank.FIVE);
        Card card1 = new Card(Suit.SPADE,Rank.QUEEN);*/

        //System.out.println(card.toString());
/*
        Deck deck= new Deck(true);
*/
       /* deck.addCard(card);
        deck.addCard(card2);
        deck.addCard(card3);
        deck.addCard(card1);*/
        //System.out.println("\n"+deck.toString());
        //Deck deck2= new Deck(true);
/*
        System.out.println(deck);
*/
       /* Game game= new Game();
        Deck deck = new Deck(true);
        deck.shuffle();
        System.out.println(deck);*/

        Deck deck = new Deck(true);
        Hand hand= new Hand();
        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);
        System.out.println("hand  test now has the following card");
        System.out.println(hand);
        System.out.println("deck test  now has the following card");
        System.out.println(deck);



    }

}