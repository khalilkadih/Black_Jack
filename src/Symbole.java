import java.lang.String;
public enum Symbole {
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");
    String nomSymbole;

    Symbole(String nomSymbole) {

        this.nomSymbole = nomSymbole;
    }

    public String toString(){
        return nomSymbole;
    }
}
