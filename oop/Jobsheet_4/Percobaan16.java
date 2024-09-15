 

import java.util.Scanner;

public class Percobaan16 {
    public static void main(String[] args) {
        byte bulanAngka;
        String namaBulan = "";
        Scanner input = new Scanner(System.in); System.out.print("Input bulan dalam angka (1 s.d. 12): "); bulanAngka = input.nextByte();
        switch (bulanAngka) {
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari";
                break;
            case 3: namaBulan = "Maret";
                break;
            case 4: namaBulan = "April";
                break;
            case 5: namaBulan = "Mei";
                break;
            case 6: namaBulan = "Juni";
                break;
            case 7: namaBulan = "Juli";
                break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September";
                break;
            case 10: namaBulan = "Oktober";
                break;
            case 11: namaBulan = "Nopember";
                break;
            case 12: namaBulan = "Desember";
                break;
        }
        System.out.println("Nama bulan: " + namaBulan);
        input.close();
    }
}
