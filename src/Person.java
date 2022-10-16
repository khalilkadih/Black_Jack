abstract class Person {
    private String name;
    private Hand main;
    public Person() {
        this.name = "";
        this.main = new Hand();
    }
    public Boolean hasBlackJack(){
        if(this.getMain().calculatedValue()==21){
            return  true;
        }
        else return false;
        //return this.getHand().calculatedValue() == 21 ? true : false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hand getMain() {
        return main;
    }

    public void setMain(Hand main) {
        this.main = main;
    }
    public void afficherHand(){
        System.out.println(this.name+"'s look like this : ");
        System.out.println(this.main +" valued at "+this.main.calculatedValue());
    }
    public void hit(Deck deck,Deck discared){
    if(!deck.hasCard()){
        deck.reloadDeckFromDiscard(discared);
    }
    this.main.takeCardFromDeck(deck);
        System.out.println(this.name+" get card");
        this.afficherHand();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hand=" + main +
                '}';
    }
}
