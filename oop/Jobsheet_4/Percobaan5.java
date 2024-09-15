 

import java.util.Scanner;

public class Percobaan5 {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah bilangan bulat: ");
        bilangan = input.nextInt();
        if (bilangan % 2 == 0)
            System.out.println("Bilangan Genap");
        else
            System.out.println("Bilangan Ganjil");
        input.close();
    }
}
