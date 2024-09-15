import java.util.*;

class kondisi {
  void pajak(int penghasilan) {

    if (penghasilan <= 1000000){
      System.out.println("Anda tidak wajib bayar pajak");
    } else {
      double pajak = (penghasilan - 100000) * 0.1;
      System.out.println("Anda wajib bayar pajak sebesar " + pajak);
    }
  }
}

public class Latihan_1{
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    kondisi Kondisi = new kondisi();
    
    System.out.println("Program Penentuan Pajak");
    System.out.print("Input penghasilan perbulan anda :");
    int penghasilan = inputScanner.nextInt();
    System.out.println();
    Kondisi.pajak(penghasilan);
    inputScanner.close();
  }
}