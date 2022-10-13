public class Game {
    private int wins ,losses,pushes;

    public Game() {
        this.wins = 0;
        this.losses = 0;
        this.pushes =0;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getPushes() {
        return pushes;
    }

    public void setPushes(int pushes) {
        this.pushes = pushes;
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
