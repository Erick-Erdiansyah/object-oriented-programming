import java.util.Scanner;

class Loopp{
  int a,factorial = 1;
  void For(int i, int l){
    for (; i >= l; i--) {
      factorial = factorial * i;
      System.out.print("For ke " + i + ";");
    }
    System.out.println();
    System.out.println("Hasil faktorial = " + factorial);
  }
  void While(int i, int l){
    while (i >= l) {
      // factorial = factorial * i;
      System.out.print("While ke " + i + ";");
      i--;
    }
    // System.out.println(factorial);
  }
  void DoWhile(int i, int l){
    do {
      // factorial = factorial * i;
      System.out.print("Do While ke " + i + ";");
      i--;
    } while (i >= l);
    // System.out.println(factorial);
  }
}

public class Latihan_6 {
  public static void main(String[] args) {
    Scanner uwu = new Scanner(System.in);
    int l = 1;
    Loopp loop = new Loopp();
    // System.out.print("mulai dari mana :");
    // int i = uwu.nextInt();
    System.out.print("diulang berapa kali :");
    int i = uwu.nextInt();
    loop.For(i, l);
    System.out.println();
    loop.While(i, l);
    System.out.println();
    loop.DoWhile(i, l);
    uwu.close();
  }
}
