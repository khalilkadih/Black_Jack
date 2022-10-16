public class Main {
    public static void main(String[] args) {

        System.out.println("======================   Welcome to BlackJack! ===================== ");
        System.out.println("======================                         ===================== ");
        System.out.println("======================                         ===================== ");
        System.out.println("\n");


        Deck deck = new Deck();
        Cartes cartes= new Cartes(Symbole.SPADE,Numero.QUEEN);

        System.out.println("========== All carte sans Shuffled==========");
        System.out.println("==========                        ==========");
        Deck testDeck= new Deck(true);
        System.out.println(testDeck);
        System.out.println("=================== ALL cart shuffled =========================");
        System.out.println("===================                     =========================");
        testDeck.melange();
        System.out.println(testDeck);
        System.out.println("<==============================================================>");
        Game game= new Game();
        game.toString();









    }


}