/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_08;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;

/**
 *
 * @author erdia
 */
public class percobaan_02 {
    public percobaan_02(){
        try {
            DriverManager.registerDriver(new Driver());
            System.out.println("driver berhasil di load");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new percobaan_02();
    }
}
