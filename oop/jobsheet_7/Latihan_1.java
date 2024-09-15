import java.util.*;

public class Latihan_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Tentukan panjang Larik : ");
    int panjang = input.nextInt();
    input.nextLine();
    int[] nilai = new int[panjang];
    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Larik ke " + (i + 1) + " : ");
      nilai[i] = input.nextInt();
    }
    Arrays.sort(nilai,0,nilai.length);
    System.out.println();
    System.out.println("Isi Larik ascending :");
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("nilai ke : " + (i + 1) + ": " + nilai[i]);
    }
    System.out.println();
    System.out.println("Isi Larik descending :");
    System.out.println();
    int n = 0;
    for (int i = nilai.length; i > 0; i--) {
      int j = i-1;
      n++;
      System.out.println("nilai ke : " + n + " : " + nilai[j]);
    }
    input.close();
  }
}
