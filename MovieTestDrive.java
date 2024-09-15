class movie {
  String title;
  String genre;
  int rating;

  void playIt(){
    System.out.println("Playing the Movie");
  }
}
public class MovieTestDrive {
  public static void main (String[] args){
    movie one = new movie();
    one.title = "gone with the Stock";
    one.genre = "Tragic";
    one.rating = -2;

    movie two = new movie();
    two.title = "Lost in Cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();

    movie three = new movie();
    three.title = "Byte club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;
  }
}
