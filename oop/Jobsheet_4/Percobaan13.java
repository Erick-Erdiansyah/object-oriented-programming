 

import java.util.Scanner;

public class Percobaan13 {
    public static void main(String[] args) {
        byte bulanAngka;
        String namaBulan = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Input bulan dalam angka: ");
        bulanAngka = input.nextByte();
        if (bulanAngka == 1)
            namaBulan = "Januari";
        else if (bulanAngka == 2)
            namaBulan = "Februari";
        else if (bulanAngka == 3)
            namaBulan = "Maret";
        else if (bulanAngka == 4)
            namaBulan = "April";
        else if (bulanAngka == 5)
            namaBulan = "Mei";
        else if (bulanAngka == 6)
            namaBulan = "Juni";
        else if (bulanAngka == 7)
            namaBulan = "Juli";
        else if (bulanAngka == 8)
            namaBulan = "Agustus";
        else if (bulanAngka == 9)
            namaBulan = "September";
        else if (bulanAngka == 10)
            namaBulan = "Oktober";
        else if (bulanAngka == 11)
            namaBulan = "Nopember";
        else if (bulanAngka == 12)
            namaBulan = "Desember";
        System.out.println("Nama bulan: " + namaBulan);
        input.close();
    }
}
