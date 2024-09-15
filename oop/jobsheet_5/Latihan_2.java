import java.util.Scanner;

class Lo{
  void For(int i, int l){
    for (; i < l; i++) {
      if (i > 9) {
        System.out.print(" For Ke : " + i);
      }
    }
  }
  void While(int i, int l){
    while (i < l) {
      if (i > 9) {
        System.out.print(" While Ke : " + i);
      }
      i++;
    }
  }
  void DoWhile(int i, int l){
    do {
      if (i > 9) {
        System.out.print(" Do While Ke : " + i);
      }
      i++;
    } while (i < l);
  }
}

public class Latihan_2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Lo loop = new Lo();
    // System.out.print("mulai dari mana :");
    // int i = in.nextInt();
    int i = 1;
    System.out.print("diulang berapa kali :");
    int l = in.nextInt();
    l = l + i;
    // loop.For(i, l);
    // System.out.println();
    // loop.While(i, l);
    // System.out.println();
    loop.DoWhile(i, l);
    in.close();
  }
}
