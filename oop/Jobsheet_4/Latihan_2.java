import java.util.*;

class kondisi {
  void pajak(String huruf) {
    huruf = huruf.toLowerCase();
    switch (huruf) {
      case "a": 
        System.out.println("Istimewa");
        break;
      case "b": 
        System.out.println("Cukup");
        break;
      case "c": 
        System.out.println("belum cukup");
        break;
      case "d": 
        System.out.println("kurang");
        break;
      case "e": 
        System.out.println("Coba lagi");
        break;
      default:
        System.out.println("Tidak terdaftar");
        break;
    }
  }
}

public class Latihan_2{
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    kondisi Kondisi = new kondisi();
    
    System.out.println("Program Komentar Nilai Huruf");
    System.out.print("Input nilai huruf anda :");
    try {
      String penghasilan = inputScanner.nextLine();
      Kondisi.pajak(penghasilan);
    } catch (Exception e) {
      System.out.println("Harus huruf");
    }
    inputScanner.close();
  }
}