public class doggo {
  String name;

  public static void main (String[] args){
    // make a dog 0-0, object and access it
    doggo dog1 = new doggo();
    dog1.bark();
    dog1.name = "Bart";

    // make an array of dog
    doggo[] mydog = new doggo[3];
    // and put some dog into it
    mydog[0] = new doggo();
    mydog[1] = new doggo();
    mydog[2] = dog1;

    // now access the dog using array reference
    mydog[0].name = "Fred";
    mydog[1].name = "Marge";

    // hmmm... what  is mydog[2] name ?
    System.out.println("Last dog name is " + mydog[2].name);

    // now loop trhough the array
    // and tell all dog to bark
    int x = 0;
    while (x < mydog.length) {
      System.out.print(mydog[x].name + " ");
      mydog[x].bark();
      x = x + 1;
    }
  }
  public void bark(){
    System.out.println("bark : \"Yamete kudasai\"");
  }
  public void eat(){
    // do something great
  }
  public void chaseCat(){
    // do something great
  }
}
