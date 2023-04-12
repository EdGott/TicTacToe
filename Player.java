public class Player {

    protected int player = 1;

    public Player() {
    }

    public void swapPlayer() {
        switch(player) {
            case (2):
                player--;
                break;
            case (1):
                player++;
                break;
        }
    }

    public String toString() {
        return "" + player;
    }

    public int getPlayer() {
        return player;
    }
}
