 

import java.util.Scanner;

public class Percobaan12 {
    public static void main(String[] args) {
        int gajiKaryawan;
        char golongan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Golongan Anda: ");
        golongan = input.next().toUpperCase().charAt(0);
        gajiKaryawan = 0;
        if (golongan == 'A')
            gajiKaryawan = 50000000; else if (golongan == 'B')
            gajiKaryawan = 30000000; else if (golongan == 'C')
            gajiKaryawan = 10000000;
        System.out.println("Gaji Anda: " + gajiKaryawan);
        input.close();
    }
}
