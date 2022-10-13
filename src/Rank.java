public enum Rank {


    ACE("Ace",11),
    TWO("Two",2),
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

    String rankName;
    int rankValue;

    Rank(String rankNme, int rankVlue) {

        this.rankName = rankNme;
        this.rankValue = rankVlue;
    }

    public String getRankName() {

        return rankName;
    }

    public void setRankName(String rankName) {

        this.rankName = rankName;
    }

    public int getRankValue() {

        return rankValue;
    }

    public void setRankValue(int rankValue) {

        this.rankValue = rankValue;
    }

    @Override
    public String toString() {

        return rankName;
    }
}

