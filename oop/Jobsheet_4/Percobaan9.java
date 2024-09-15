 

import java.util.Scanner;

public class Percobaan9 {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah bilangan bulat: ");
        bilangan = input.nextInt();
        if (bilangan > 0)
            System.out.println("Bilangan Positif");
        else if (bilangan < 0)
            System.out.println("Bilangan Negatif");
        else
            System.out.println("Bilangan Nol");
        input.close();
    }
}
