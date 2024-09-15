class hewan {
  public void bersuara(){
    System.out.println("Hewan tidak bersuara");
  }
}

class kucing extends hewan {
  public void bersuara(){
    System.out.println("miau");
  }
}

class singa extends hewan{
  public void bersuara(){
    System.out.println("aum");
  }
}

public class percobaan_1{
  public static void main(String[] args) {
    hewan hewan[] = new hewan[5];

    hewan[0] = new kucing(); 
    hewan[1] = new singa();
    hewan[2] = new kucing();
    hewan[3] = new singa();
    hewan[4] = new singa();
    
    for (int i = 0; i < hewan.length; i++) {
      hewan[i].bersuara();
    }
  }
}