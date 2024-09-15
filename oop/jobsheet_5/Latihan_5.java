import java.util.Scanner;

class Loo{
  int total,rata,jumlah = 0;
  void For(int i, int l){
    for (; i < l; i++) {
      if (i % 3 != 0) {
        total = total + i;
        jumlah = jumlah + 1;
        System.out.print(" For Ke : " + i);
      }
    }
    System.out.println();
    System.out.println("Total Nilai : " + total);
    System.out.println("Jumlah bilangan : " + jumlah);
    System.out.println("Rata - rata adalah : " + (rata = total / jumlah));
  }
  void While(int i, int l){
    while (i < l) {
      if (i % 3 != 0) {
        total = total + i;
        jumlah = jumlah + 1;
        System.out.print(" While Ke : " + i);
      }
      i++;
    }
  }
  void DoWhile(int i, int l){
    do {
      if (i % 3 != 0) {
        total = total + i;
        jumlah = jumlah + 1;
        System.out.print(" Do While Ke : " + i);
      }
      i++;
    } while (i < l);
  }
}

public class Latihan_5 {
  public static void main(String[] args) {
    Scanner uwu = new Scanner(System.in);
    Loo loop = new Loo();
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
