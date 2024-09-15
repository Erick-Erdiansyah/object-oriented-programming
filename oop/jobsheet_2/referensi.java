class Manusia {
 //deklarasi konstanta
 final String NAMA = "Andi";
 final short TINGGI_BADAN = 160;
 final byte BERAT_BADAN = 60;
 //deklarasi methods
 void berjalan() {
 System.out.println("Berjalan");
 }
 void berlari() {
 System.out.println("Berlari");
 }
 void makan() {
 System.out.println("Makan");
 }
 void minum() {
 System.out.println("Minum");
 }
}

public class referensi {
  public static void main(String args[]) {
    //deklarasi variabel
    String nama, jenisKelamin, statusMenikah;
    Integer nilai;
    //inisialisasi variabel
    nama = "Andi"; // nama = new String("Andi");
    jenisKelamin = "Pria";
    statusMenikah = "Menikah";
    nilai = 10;
      //menampilkan nilai variabel ke layar output
    System.out.println(nama);
    System.out.println(jenisKelamin);
    System.out.println(statusMenikah);
    System.out.println(nilai);
    Manusia manusia = new Manusia();
    System.out.println(manusia);
    System.out.println(manusia.NAMA);
    System.out.println(manusia.TINGGI_BADAN);
    System.out.println(manusia.BERAT_BADAN);
    manusia.berjalan();
    manusia.berlari();
    manusia.makan();
    manusia.minum();
  }
}

