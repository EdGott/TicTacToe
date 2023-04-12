import java.util.Scanner;

class Main {
  private static Scanner in = new Scanner(System.in);
  static Board gameBoard = new Board();
  static Player player = new Player();
  static int play = 1;

  public static void main(String[] args) {
      String space = "";
      System.out.print("\033[H\033[2J"); // CLEAR JAVA COMPILATION ON SCREEN

      // Game loop.
      while (play == 1) {
          System.out.println(gameBoard.toString());

          System.out.print("Player " + player + ", pick a space: ");
          space = in.nextLine();

          gameBoard.changeSpace(space.toLowerCase(), player);
          checkWin();
      }
  }

  public static void checkWin() {
    String[] r1 = gameBoard.getRow1();
    String[] r2 = gameBoard.getRow2();
    String[] r3 = gameBoard.getRow3();
    
    // Check player 1 win conditions
    if (r1[0].equals(" X ") & r1[1].equals(" X ") & r1[2].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r2[0].equals(" X ") & r2[1].equals(" X ") & r2[2].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r3[0].equals(" X ") & r3[1].equals(" X ") & r3[2].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r1[0].equals(" X ") & r2[0].equals(" X ") & r3[0].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r1[1].equals(" X ") & r2[1].equals(" X ") & r3[1].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r1[2].equals(" X ") & r2[2].equals(" X ") & r3[2].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }

    if (r1[0].equals(" X ") & r2[1].equals(" X ") & r3[2].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
    if (r1[2].equals(" X ") & r2[1].equals(" X ") & r3[0].equals(" X ")) {
      System.out.println("PLAYER 1 WINS!");
      play = 0;
    }
  
    // Check player 2 win conditions
    if (r1[0].equals(" O ") & r1[1].equals(" O ") & r1[2].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r2[0].equals(" O ") & r2[1].equals(" O ") & r2[2].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r3[0].equals(" O ") & r3[1].equals(" O ") & r3[2].equals(" X ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r1[0].equals(" O ") & r2[0].equals(" O ") & r3[0].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r1[1].equals(" O ") & r2[1].equals(" O ") & r3[1].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r1[2].equals(" O ") & r2[2].equals(" O ") & r3[2].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r1[0].equals(" O ") & r2[1].equals(" O ") & r3[2].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
    if (r1[2].equals(" O ") & r2[1].equals(" O ") & r3[0].equals(" O ")) {
      System.out.println("PLAYER 2 WINS!");
      play = 0;
    }
  }
}