public class bottlesong {
  public static void main(String[] args){

    int bottlesum = 10;
    String word = "bottles";

    while (bottlesum > 0){

      if (bottlesum == 1) {
        word = "bottle";
      }

      System.out.println(bottlesum + " Green " + word + ", hanging on the wall");
      System.out.println(bottlesum + " Green " + word + ", hanging on the wall");
      System.out.println("and if one green bottle should accidentaly fall,");
      bottlesum = bottlesum - 1;

      if (bottlesum > 0){
        System.out.println("There'll be " + bottlesum + " green " + word + ", hanging on the wall");
      }else{
        System.out.println("there'll be no green bottles, hanging on the wall");
      }

    }
  }

}
