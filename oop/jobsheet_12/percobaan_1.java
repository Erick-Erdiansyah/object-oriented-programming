// Awalnya

// public class BagiNol {
//   public static void main(String[] args) {
//   System.out.println("Sebelum pembagian"); 
//   System.out.println(5/0);
//   System.out.println("Sesudah pembagian");
//   }
//  }
public class percobaan_1 {
  public static void main(String[] args) {
    System.out.println("Sebelum pembagian");
    try {
      System.out.println(5 / 0);
    } catch (Throwable t) {
      System.out.println("Terjadi pembagian dengan 0");
    }
    System.out.println("Sesudah pembagian");
  }
}