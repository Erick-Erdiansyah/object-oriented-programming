public class percobaan_3 {
  public static void main(String[] args) {
    int[][] matriks2x3 = new int[2][3];
    //mengisi elemen matriks
    matriks2x3[0][0] = 3;
    matriks2x3[0][1] = 2;
    matriks2x3[0][2] = 4;
    matriks2x3[1][0] = 0;
    matriks2x3[1][1] = 4;
    matriks2x3[1][2] = 5;
    //menampilkan atau mencetak elemen matriks ke layar console
    System.out.println("MATRIKS 2x3");
    System.out.print("| " + matriks2x3[0][0]);
    System.out.print(" " + matriks2x3[0][1]);
    System.out.println(" " + matriks2x3[0][2] + " |");
    System.out.print("| " + matriks2x3[1][0]);
    System.out.print(" " + matriks2x3[1][1]);
    System.out.print(" " + matriks2x3[1][2] + " |");
    }
}
