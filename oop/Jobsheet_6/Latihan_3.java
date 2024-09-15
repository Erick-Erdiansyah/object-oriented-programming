import java.util.*;


public class Latihan_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int loop = 0, nilai = 1;
    
    System.out.println("PROGRAM TEBAK ANGKA (1 S.D. 10)");
    System.out.println();
    System.out.print("Masukan Nilai Maksimal :");

    nilai = input.nextInt();
    int acak = rand.nextInt(nilai)+1;

    // System.out.println(acak);
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