public class phrase {
  public static void main (String[] args){
    //bikin tiga set kata untuk dipilih
    String[] WordListOne = {
      "agnostic","opinionated", "voice activated", "haptically driven", "extensible"
        ,"reactive", "agent based", "functional", "AI based" , "strongly typed"
    };
    String[] WordListTwo = {
      "Loosely coupled", "six sigma" , "asynchronous", "event driven" , "pub-sub",
      "IoT", "Cloud native" ,"service oriented", " containerized", "serverless",
      "microservice" , "distributed ledger"};

    String[] WordListThree = {
      "Framework", "Library", "DSL", "REST API", "repository", "pipeline", "service mesh",
      "architecture", "prespective", "design", "orientation"};

    // menghitung berapa jumlah kata di masing masing list
    int Onelength = WordListOne.length;
    int twolength = WordListTwo.length;
    int threelength = WordListThree.length;

    // generate three random number
    java.util.Random randomGenerator = new java.util.Random();
    int rand1 = randomGenerator.nextInt(Onelength);
    int rand2 = randomGenerator.nextInt(twolength);
    int rand3 = randomGenerator.nextInt(threelength);

    String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];

    System.out.println("What we need is a " + phrase);
  }
}
