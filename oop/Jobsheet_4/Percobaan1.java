 

import java.util.Scanner;
public class Percobaan1 {
    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah bil bulat: ");
        bil = input.nextInt();
        if (bil % 2 == 0){
            System.out.println("Bilangan yang anda masukkan " + "adalah Bilangan Genap");
        }
        input.close();

    }
}
