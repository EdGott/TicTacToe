public class Board {

    private static String[] row1 = {"   ", "   ", "   "};
    private static String[] row2 = {"   ", "   ", "   "};
    private static String[] row3 = {"   ", "   ", "   "};

    public Board() {

    }

    public void changeSpace(String space, Player player) {
        System.out.print("\033[H\033[2J"); // CLEAR SCREEN
        if (player.getPlayer() == 1) {
            switch (space) {
                case ("1a"):
                case ("a1"):
                    if (row1[0].equals("   ")){
                        row1[0] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2a"):
                case ("a2"):
                    if (row1[1].equals("   ")){
                        row1[1] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3a"):
                case ("a3"):
                    if (row1[2].equals("   ")){
                        row1[2] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("1b"):
                case ("b1"):
                    if (row2[0].equals("   ")){
                        row2[0] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2b"):
                case ("b2"):
                    if (row2[1].equals("   ")){
                        row2[1] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3b"):
                case ("b3"):
                    if (row2[2].equals("   ")){
                        row2[2] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("1c"):
                case ("c1"):
                    if (row3[0].equals("   ")){
                        row3[0] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2c"):
                case ("c2"):
                    if (row3[1].equals("   ")){
                        row3[1] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3c"):
                case ("c3"):
                    if (row3[2].equals("   ")){
                        row3[2] = " X ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
            }
        }
        else {
            switch (space) {
                case ("1a"):
                case ("a1"):
                    if (row1[0].equals("   ")){
                        row1[0] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2a"):
                case ("a2"):
                    if (row1[1].equals("   ")){
                        row1[1] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3a"):
                case ("a3"):
                    if (row1[2].equals("   ")){
                        row1[2] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("1b"):
                case ("b1"):
                    if (row2[0].equals("   ")){
                        row2[0] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2b"):
                case ("b2"):
                    if (row2[1].equals("   ")){
                        row2[1] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3b"):
                case ("b3"):
                    if (row2[2].equals("   ")){
                        row2[2] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("1c"):
                case ("c1"):
                    if (row3[0].equals("   ")){
                        row3[0] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("2c"):
                case ("c2"):
                    if (row3[1].equals("   ")){
                        row3[1] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
                case ("3c"):
                case ("c3"):
                    if (row3[2].equals("   ")){
                        row3[2] = " O ";
                        player.swapPlayer();
                        break;
                    }
                    else {
                        System.out.println("Space taken. Player " + player.toString() + " pick another space.");
                        break;
                    }
            }
        }
    }

    public String toString() {
        String boardStr = "";

        boardStr += "   -------------\nA: |";
        for (String cell : row1) {
            boardStr += cell + "|";
        }
    
        boardStr += "\n   -------------\nB: |";
        for (String cell : row2) {
            boardStr += cell + "|";
        }
        
        boardStr += "\n   -------------\nC: |";
        for (String cell : row3) {
            boardStr += cell + "|";
        }
        boardStr += "\n   -------------";
        boardStr += "\n     1   2   3";

        return boardStr;
    }

    public String[] getRow1() {
        return row1;
    }

    public String[] getRow2() {
        return row2;
    }

    public String[] getRow3() {
        return row3;
    }
}
