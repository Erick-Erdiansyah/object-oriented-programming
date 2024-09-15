 

import java.util.Scanner;

public class Percobaan7 {
    public static void main(String[] args) {
        int gajiPokok, totalGaji;
        byte jamKerjaNormal, jamKerja;
        Scanner input = new Scanner(System.in);
        gajiPokok = 3000000;
        jamKerjaNormal = 12;
        System.out.print("Input Jam Kerja Anda: ");
        jamKerja = input.nextByte();
        if (jamKerja > jamKerjaNormal)
            totalGaji = gajiPokok + ((jamKerja - jamKerjaNormal) * 10000);
        else
            totalGaji = gajiPokok;
        System.out.println("Gaji Anda: " + totalGaji);
        input.close();
    }
}
