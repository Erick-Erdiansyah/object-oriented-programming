/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_08;

/**
 *
 * @author erdia
 */
public class percobaan_01 {
    public percobaan_01(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new percobaan_01();
    }
}
