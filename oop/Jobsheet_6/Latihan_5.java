import java.util.*;


public class Latihan_5 {
  public static void main(String[] args) {
    double awal,pangkat,hasil;
    String loop = "";
    Scanner ipt = new Scanner(System.in);
    System.out.println("Program Perpangkatan");
    try {
      while (!loop.equalsIgnoreCase("n")) {
        System.out.print("Input bilangan yang akan dipangkatkan : ");
        awal = ipt.nextInt();
        System.out.print("Input dipangkat : ");
        pangkat = ipt.nextInt();
        ipt.nextLine();
        hasil = Math.pow(awal, pangkat);
        System.out.println("Hasil dari " + awal + " pangkat " + pangkat + " : " + hasil);
        System.out.println();
        System.out.print("Ingin coba lagi ? y/n : ");
        loop = ipt.nextLine();
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Terjadi kesalahan : " + e.getMessage());
    }
    ipt.close();
  }
}