// awalnya

// public class EfekThrow {
//   public static void main(String[] args) {
//     RuntimeException r;
//     r = new RuntimeException("Eksepsi RuntimeException");
//     System.out.println("Sebelum throw");
//     throw (r);
//   }
// }

public class percobaan_3 {
  public static void main(String[] args) {
    ArithmeticException r;
    r = new ArithmeticException("Eksepsi ArithmeticException");
    System.out.println("Sebelum throw");
    throw (r);
  }
}