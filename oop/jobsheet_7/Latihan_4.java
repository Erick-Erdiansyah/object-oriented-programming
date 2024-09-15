import java.util.Scanner;

public class Latihan_4 {
  public static void main(String[] args) {
    int baris = 2;
    int kolom = 2;
    int[][] matriks = new int[baris][kolom];
    int[][] matrik = new int[baris][kolom];
    int[][] mat = new int[baris][kolom];
    Scanner input = new Scanner(System.in);
    // mengisi elemen matriks
    System.out.println("Matriks 2x2 pertama");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print("Matriks[" + i + "][" + j + "]: ");
        matriks[i][j] = input.nextInt();
      }
    }
    System.out.println();
    System.out.println("Matriks 2x2 kedua");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print("Matriks[" + i + "][" + j + "]: ");
        matrik[i][j] = input.nextInt();
      }
    }
    System.out.println();
    System.out.println("Matriks 2x2 pertama");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        System.out.print(" " + matriks[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println();
    System.out.println("Matriks 2x2 kedua");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        System.out.print(" " + matrik[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println();
    System.out.println("perkalian Matriks 2x2 pertama dan kedua");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        if (i > 0) {
          int k = i - 1;
          int l = j - 1;
        }
        int k = 0;
        int l = 0;

        int sem = (matriks[i][j] *  matrik[j][i]) + (matriks[k][l] *  matrik[l][k]);
        System.out.print(" " + sem + " ");
      }
      System.out.println("|");
    }
    input.close();
  }
}
