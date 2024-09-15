import java.util.*;

class kondisi {
  void gaji(int penghasilan) {
    Double total;
    switch (penghasilan) {
      case 1: 
        total = 1000000 + (1000000 * 0.05);
        System.out.println("Gaji total anda sebesar Rp" +total);
      break;
      case 2: 
       total = 1500000 + (1500000*0.1);
      System.out.println("Gaji total anda sebesar Rp" + total);
      break;
      case 3: 
      total = 2000000 + (2000000/0.1);
      System.out.println("Gaji total anda sebesar Rp" + total);
      break;
      case 4: 
      total = 2500000 + (2500000/0.15);
      System.out.println("Gaji total anda sebesar Rp" + total);
      break;
      case 5: 
      total = 3000000 + (3000000/0.2);
      System.out.println("Gaji total anda sebesar Rp" +  total);
      break;
      default:
      System.out.println("Gaji anda tidak ada di sini");
      break;
    }
  }
}

public class Latihan_3{
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    kondisi Kondisi = new kondisi();
    
    System.out.println("Program perhitungan total gaji pegawai");
    System.out.print("Input golongan pegawai anda (1-5) :");
    try {
      int penghasilan = inputScanner.nextInt();
      Kondisi.gaji(penghasilan);
    } catch (Exception e) {
      System.out.println("Harus angka 1-5");
    }
    inputScanner.close();
  }
}