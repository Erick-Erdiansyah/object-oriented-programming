import java.util.Scanner;

public class Do                                                {
  public static void main(String[] args)                       {
    Scanner input = new Scanner(System.in)                     ;
    System.out.print("mulai dari mana :")                    ;
    int i = input.nextInt()                                    ;
    System.out.print("diulang berapa kali :")                ;
    int l = input.nextInt()                                    ;
    l = l +i                                                   ;
    do                                                         {
      System.out.println("Pemrograman Java : " + i)            ; 
      i++                                                      ;
    } while (i <= l)                                           ;
    input.close()                                              ;
                                                               }
                                                               }