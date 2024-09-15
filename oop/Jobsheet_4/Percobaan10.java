 

import java.util.Scanner;

public class Percobaan10 {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Input koordinat x: ");
        x = input.nextInt();
        System.out.print("Input koordinat y: ");
        y = input.nextInt();
        if ((x > 0) && (y > 0))
            System.out.println("Kuadran I");
        else if ((x < 0) && (y > 0))
            System.out.println("Kuadran II");
        else if ((x < 0) && (y < 0))
            System.out.println("Kuadran III");
        else if ((x > 0) && (y < 0))
            System.out.println("Kuadran IV");
        else
            System.out.println("Tidak di kuadran manapun");
        input.close();
    }
}
