public class Dealer extends Person{

    public Dealer(){
        super.setName("Dealer");
    }
    public void printfirstHand(){
        System.out.println("the delear's hand look like this :");
        System.out.println(super.getMain().getCard(0));
        System.out.println("the second card is face down .:");

    }


}
