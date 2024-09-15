class DrumKit{
  boolean tophat = true;
  boolean snare = true;

  void playTopHat(){
    System.out.println("ding ding da-ding");
  }

  void playSnare(){
    System.out.println("bang bang ba-bang");
  }
}

class DrumKitTest{
  public static void main (String[] args){
    // ini caraku, agak berantakan tapi semuanya kepakai
    DrumKit d = new DrumKit();
    if (d.snare == true){
      d.playSnare();
    }
    d.snare = false;
    d.playTopHat();
  }
}