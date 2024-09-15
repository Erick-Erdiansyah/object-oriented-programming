import java.util.Scanner;

public class Latihan_2 {
  public static void main(String[] args) {
    int baris = 2;
    int kolom = 3;
    int[][] matriks2x3 = new int[baris][kolom];
    int[][] matrik2x3 = new int[baris][kolom];
    Scanner input = new Scanner(System.in);
    // mengisi elemen matriks
    System.out.println("Matriks 2x3 pertama");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print("Matriks[" + i + "][" + j + "]: ");
        matriks2x3[i][j] = input.nextInt();
      }
    }
    System.out.println();
    System.out.println("Matriks 2x3 kedua");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print("Matriks[" + i + "][" + j + "]: ");
        matrik2x3[i][j] = input.nextInt();
      }
    }
    System.out.println();
    System.out.println("Matriks 2x3 pertama");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        System.out.print(" " + matriks2x3[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println();
    System.out.println("Matriks 2x3 kedua");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        System.out.print(" " + matriks2x3[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println();
    System.out.println("penjumlahan Matriks 2x3 pertama dan kedua");
    for (int i = 0; i < baris; i++) {
      System.out.print("|");
      for (int j = 0; j < kolom; j++) {
        System.out.print(" " + (matriks2x3[i][j] +  matriks2x3[i][j]) + " ");
      }
      System.out.println("|");
    }
    input.close();
  }
}
