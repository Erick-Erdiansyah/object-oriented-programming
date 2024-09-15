import java.util.Scanner;

class L{
  void For(int i, int l){
    for (; i < l; i++) {
      System.out.print(" For Ke : " + i + ";");
    }
  }
  void While(int i, int l){
    while (i < l) {
      System.out.print(" While Ke : " + i  + ";");
      i++;
    }
  }
  void DoWhile(int i, int l){
    do {
      System.out.print(" Do While Ke : " + i  + ";");
      i++;
    } while (i < l);
  }
}

public class Latihan_1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    L loop = new L();
    // System.out.print("mulai dari mana :");
    // int i = in.nextInt();
    int i = 1;
    System.out.print("diulang berapa kali :");
    int l = in.nextInt();
    l = l + i;
    loop.For(i, l);
    System.out.println();
    loop.While(i, l);
    System.out.println();
    loop.DoWhile(i, l);
    in.close();
  }
}
