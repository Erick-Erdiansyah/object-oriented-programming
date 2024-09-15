import java.util.Scanner;

public class ForAngka{
  public static void main(String[] args) {
    int i = 0;
    Scanner input = new Scanner(System.in);
    // for (int i = 10; i > 0; i--) {
    //   System.out.println("something no : "+i);
    // }
    System.out.print("Mau dimulai dari mana : ");
    i = input.nextInt();
    System.out.print("Mau diulang berapa kali : ");
    int loop = input.nextInt();
    loop = loop + i;
    while (i <= loop) {
      System.out.println("loop ke : " + i);
      i++;
    }
    input.close();
  }
}