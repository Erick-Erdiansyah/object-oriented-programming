public class OperatorCasting {
  public static void main(String[] args) {
    int x = 10;
    int y = 257;
    byte a = 0;
    System.out.println("Nilai Awal");
    System.out.println("Nilai x (bertipe int) = " + x);
    System.out.println("Nilai y (bertipe int) = " + y);
    System.out.println("Nilai a (bertipe byte) = " + a);
    System.out.println("Operator Casting Tipe Data");
    System.out.println("Contoh 1:");
    System.out.println("a = (byte) x");
    a = (byte) x;
    System.out.println("Nilai a = " + a);
    System.out.println("Contoh 2:");
    System.out.println("a = (byte) y");
    a = (byte) y;
    System.out.println("Nilai a = " + a);
  }
}
