public enum Numero {


    ACE("Ace", 11),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four",4),
    FIVE("Five",5),
    SIX("Six",6),
    SEVEN("Seven",7),
    EIGHT("Eight",8),
    NINE("Nine",9),
    TEN("Ten",10),
    JACK("Jack",10),
    QUEEN("Queen",10),
    KING("King",10);

    String nomNumero;
    int valeurDeNumero;

    Numero(String valeurDeNumero, int nomNumero) {
        this.nomNumero = valeurDeNumero;
        this.valeurDeNumero = nomNumero;
    }

    public String getNomNumero() {

        return nomNumero;
    }
    public void setNomNumero(String nomNumero) {

        this.nomNumero = nomNumero;
    }
    public int getValeurDeNumero() {

        return valeurDeNumero;
    }
    public void setValeurDeNumero(int valeurDeNumero) {

        this.valeurDeNumero = valeurDeNumero;
    }
    @Override
    public String toString() {

        return nomNumero;
    }
}

