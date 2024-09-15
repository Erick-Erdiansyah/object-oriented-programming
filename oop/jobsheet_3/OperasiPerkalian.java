import java.util.Scanner;

public class OperasiPerkalian {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Perkalian 2 bilangan integer");
    System.out.println();
    System.out.print("masukan bilangan pertama :");
    String a = scanner.nextLine();
    System.out.println();
    System.out.print("masukan bilangan kedua :");
    String b = scanner.nextLine();
    System.out.println();

    // operasi
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);
    int z = x * y;

    System.out.println();
    System.out.println("Hasil perkalian bilangan pertama dan kedua adalah : " + z);
    scanner.close();
  }
}
