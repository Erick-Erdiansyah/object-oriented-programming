import java.util.Scanner;

class Loop{
  void For(int i, int l){
    for (; i < l; i++) {
      if (i % 2 == 1 && i % 5 != 0) {
        System.out.print(" For Ke : " + i + ";");
      }
    }
  }
  void While(int i, int l){
    while (i < l) {
      if (i % 2 == 1 && i % 5 != 0) {
        System.out.print(" While Ke : " + i  + ";");
      }
      i++;
    }
  }
  void DoWhile(int i, int l){
    do {
      if (i % 2 == 1 && i % 5 != 0) {
        System.out.print(" Do While Ke : " + i  + ";");
      }
      i++;
    } while (i < l);
  }
}

public class Latihan_4 {
  public static void main(String[] args) {
    Scanner uwu = new Scanner(System.in);
    Loop loop = new Loop();
    System.out.print("mulai dari mana :");
    int i = uwu.nextInt();
    System.out.print("diulang berapa kali :");
    int l = uwu.nextInt();
    l = l + i;
    loop.For(i, l);
    System.out.println();
    loop.While(i, l);
    System.out.println();
    loop.DoWhile(i, l);
    uwu.close();
  }
}
