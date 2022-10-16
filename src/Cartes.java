public class Cartes {
    private Symbole symbole;
    private Numero numero;

    public Cartes(Symbole suit, Numero rank) {
        this.symbole = suit;
        this.numero = rank;
    }

    public Cartes(Cartes card) {
        this.symbole =card.getSymbole();
        this.numero =card.getNumero();
    }

    public Symbole getSymbole() {

        return symbole;
    }

    public void setSymbole(Symbole symbole) {

        this.symbole = symbole;
    }

    public Numero getNumero() {

        return numero;
    }

    public void setNumero(Numero numero) {

        this.numero = numero;
    }
    public int getValue(){

        return  this.numero.valeurDeNumero;
    }

    @Override
    public String toString() {

        return ("["+ numero +" of "+ symbole + "] ("+this.getValue()+")");
      //  return  suit + " "+ rank;
    }
}
