public class Game {
    private int wins ,losses,pushes;
    private Deck deck, discarded;
    private Dealer dealer;
    private Player player;

    private void startRound() {
        if(wins>0 || losses>0 || pushes >0){
            System.out.println();
            System.out.println("Start Next Round ....Wins "+ wins + " Losses "+ losses + "pushes : "+ pushes);
            dealer.getMain().discardHandToDeck(discarded);
            player.getMain().discardHandToDeck(discarded);
        }
        if(deck.cardsLeft() <4){
            deck.reloadDeckFromDiscard(discarded);
        }
        dealer.getMain().takeCardFromDeck(deck);
        dealer.getMain().takeCardFromDeck(deck);
        player.getMain().takeCardFromDeck(deck);
        player.getMain().takeCardFromDeck(deck);

        dealer.printfirstHand();
        player.afficherHand();

        if (dealer.hasBlackJack()) {
            dealer.afficherHand();
            if (player.hasBlackJack()) {
                System.out.println("you both have 21 ==> Push");
                pushes++;
                startRound();
            } else {
                System.out.println("Dealer has black jack you lose.");
                dealer.afficherHand();
                losses++;
                startRound();
            }
        }
        if (player.hasBlackJack()) {

            System.out.println("you have BlackJack !! You win ");
            wins++;
            startRound();

        }
        player.makeDecision(deck,discarded);
    }

    public Game() {
        this.wins = 0;
        this.losses = 0;
        this.pushes =0;
        deck= new Deck(true);
        discarded=new Deck();
        dealer= new Dealer();
        player = new Player();
        deck.melange();
        startRound();
        if(player.getMain().calculatedValue()>21){
            System.out.println("you have gone over 21");
            losses++;
            startRound();
        }
        if(dealer.getMain().calculatedValue()>21){
            System.out.println("Dealer bust ");
            wins++;
        }
        else if(dealer.getMain().calculatedValue()>player.getMain().calculatedValue()){
            System.out.println("======================================================");
            System.out.println("======================================================");
            System.out.println("                 you loses .                          ");
            losses++;
        } else if (player.getMain().calculatedValue()>dealer.getMain().calculatedValue()) {
            System.out.println("======================================================");
            System.out.println("======================================================");
            System.out.println("                   < You Win >                        ");
            System.out.println("======================================================");
            System.out.println("======================================================");
            System.out.println("======================================================");
            wins++;
        }
        else System.out.println("Push");
            startRound();
    }
    @Override
    public String toString() {
        return "Game{" +
                "wins=" + wins +
                ", losses=" + losses +
                ", pushes=" + pushes +
                '}';
    }
}
