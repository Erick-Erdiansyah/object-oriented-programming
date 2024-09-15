import java.util.*;

public class Latihan_4 {
  public static void main(String[] args) {
    double awal,pangkat,hasil;
    Scanner ipt = new Scanner(System.in);
    System.out.println("Program Perpangkatan");
    System.out.print("Input bilangan yang akan dipangkatkan : ");
    awal = ipt.nextInt();
    System.out.print("Input dipangkat : ");
    pangkat = ipt.nextInt();
    hasil = Math.pow(awal, pangkat);
    System.out.println("Hasil dari " + awal + " pangkat " + pangkat + " : " + hasil);
    ipt.close();
  }
}