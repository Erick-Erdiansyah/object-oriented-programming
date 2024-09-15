import java.util.*;


public class Latihan_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int acak = rand.nextInt(10)+1;
    int loop = 0;
    System.out.println(acak);
    System.out.println("PROGRAM TEBAK ANGKA (1 S.D. 10)");
    try {
      while (acak != loop) {
        System.out.println();
        System.out.print("Tebakan anda : ");
        loop = input.nextInt();
        input.nextLine();
        System.out.println();
        if (loop != acak){
          System.out.println("tebakan anda salah, coba lagi");
        }
      }
      System.out.println("Selamat anda menang !!!, hadiahnya anda bisa main lagi");
    } catch (Exception e) {
      System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
    input.close();
  }
}