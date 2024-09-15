public class percobaan_4 {
  public static void main(String[] args) {
    int[] larik = new int[10];
    try {
      larik[50] = 77;
    } catch (ArrayIndexOutOfBoundsException a) {
      a = new ArrayIndexOutOfBoundsException(
          "Subskript array harus berkisar " +
              "antara 0 sampai dengan 9");
      throw (a);
    }
  }
}
