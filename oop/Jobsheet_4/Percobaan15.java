 

import java.util.Scanner;

public class Percobaan15 {
    public static void main(String[] args) {
        int gaji, totalGaji, uangLembur;
        byte jamKerjaNormal, jamKerja;
        char golongan;
        Scanner input = new Scanner(System.in); gaji = 0;
        uangLembur = 0;
        jamKerjaNormal = 12;
        totalGaji = 0;
        System.out.print("Input Golongan Anda: "); golongan = input.next().toUpperCase().charAt(0); System.out.print("Input Jam Kerja Anda: "); jamKerja = input.nextByte();
        if (golongan == 'A') {
            gaji = 50000000;
            if (jamKerja > 12)
                uangLembur = (jamKerja - jamKerjaNormal) * 50000; totalGaji = gaji + uangLembur;
        } else if (golongan == 'B') {
            gaji = 30000000;
            if (jamKerja > 12)
                uangLembur = (jamKerja - jamKerjaNormal) * 30000;
            totalGaji = gaji + uangLembur;
        } else if (golongan == 'C') {
            gaji = 10000000;
            if (jamKerja > 12)
                uangLembur = (jamKerja - jamKerjaNormal) * 10000;
            totalGaji = gaji + uangLembur;
        }
        System.out.println("Gaji Anda: " + totalGaji);
        input.close();
    }
}
