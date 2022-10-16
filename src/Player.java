import java.util.Scanner;

public class Player extends Person{
    public Player(){
        super.setName("Player");
    }
    public void printfirstHand(){
        System.out.println("the player's hand look like this :");
        System.out.println(super.getMain().getCard(0));
        System.out.println("the second card is face down .:");
    }
    Scanner scanner=new Scanner(System.in);
    public void makeDecision(Deck deck,Deck discard) {
        int decision=0;
        boolean getNum=true;
        while (getNum){
            try {
                System.out.println("Would you Like to 'Hit'(1) or 'Stand '(2)  ");
                decision=scanner.nextInt();
                getNum=false;
            }catch (Exception e){
                System.out.println("Invalid decesion");
                scanner.next();
            }
        }
        System.out.println("You selected :"+decision);
        if(decision==1){
            this.hit(deck,discard);
            if(this.getMain().calculatedValue()>20){
                return;
            }
            else {
                this.makeDecision(deck,discard);
            }

        } else {
            System.out.println("You stand");
        }
    }
}
