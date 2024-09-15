class Gamelauncher{
  public static void main (String[] args){
    GuessGame start = new GuessGame();
    start.startgame();
  }
}

class Player{
  int number = (int)(Math.random() * 10);
  void guess(){
    System.out.println("wrong you stupid");
  }
}

class GuessGame {

  Player p1;
  Player p2;
  Player p3;


  public void startgame(){
    p1 =  new Player();
    p2 =  new Player();
    p3 =  new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1IsRight = false;
    boolean p2IsRight = false;
    boolean p3IsRight = false;

    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    while (true){
      System.out.println("Number to guess is " + targetNumber);

      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Player Guessed " + guessp1);
      
      guessp2 = p2.number;
      System.out.println("Player Guessed " + guessp2);
      
      guessp3 = p3.number;
      System.out.println("Player Guessed " + guessp3);

      if (guessp1 == targetNumber){
        p1IsRight = true;
      }
      if (guessp2 == targetNumber){
        p2IsRight = true;
      }
      if (guessp3 == targetNumber){
        p3IsRight = true;
      }

      if (p1IsRight || p2IsRight || p3IsRight){
        System.out.println("We have a winner!");
        System.out.println("Player one got it right ? " + p1IsRight);
        System.out.println("Player two got it right ? " + p2IsRight);
        System.out.println("Player three got it right ? " + p3IsRight);
        break; // infinite loop await
      } else {
        // me must keep going because everyone is stupid
        System.out.println("Players have to try again");
        break; // fuck
      }
    }
  }
}
