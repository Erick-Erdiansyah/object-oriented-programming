 

import java.util.Scanner;

public class Percobaan4 {
    public static void main(String[] args) {
        double totalHarga, totalBayar, diskon;
        Scanner input = new Scanner(System.in); System.out.print("Input total harga belanja: "); diskon = 0.15;
        totalHarga = input.nextDouble();
        totalBayar = totalHarga;
        if (totalHarga >= 100000)
            totalBayar = totalHarga - (totalHarga * diskon);
        System.out.println("Total belanja yang harus dibayar: " +
                totalBayar);
        input.close();
    }
}
