 

import java.util.Scanner;

public class Percobaan11 {
    public static void main(String[] args) {
        float nilaiUjian;
        char nilaiHuruf = ' ';
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai Ujian: ");
        nilaiUjian = input.nextFloat();
        if (nilaiUjian >= 80)
            nilaiHuruf = 'A';
        else if ((nilaiUjian >= 70) && (nilaiUjian < 80))
            nilaiHuruf = 'B';
        else if ((nilaiUjian >= 55) && (nilaiUjian < 70))
            nilaiHuruf = 'C';
        else if ((nilaiUjian >= 40) && (nilaiUjian < 55))
            nilaiHuruf = 'D';
        else if ((nilaiUjian < 40))
            nilaiHuruf = 'E';
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        input.close();
    }
}
