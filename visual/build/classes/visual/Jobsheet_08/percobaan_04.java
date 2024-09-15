/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_08;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erdia
 */
public class percobaan_04 {

    public percobaan_04() {
        try {
// step 1: register or load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver berhasil diregister");
// step 2: create connection
            String url = "jdbc:mysql://localhost/polnep";
            String user = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(
                    url, user, password
            );
// step 3: create statement
            Statement perintah = koneksi.createStatement();
// step 4: query execution
            System.out.println("Sebelum Proses Insert");
            ResultSet rs = perintah.executeQuery("SELECT * FROM JURUSAN");
            int i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i++);
                System.out.println("Kode Jurusan\t: "
                        + rs.getString("kode_jurusan"));
                System.out.println("Jurusan\t\t: "
                        + rs.getString("nama_jurusan"));
            }
            perintah.executeUpdate("INSERT INTO jurusan VALUE "
                    + "('08','Teknologi Komputer')");
            System.out.println("Setelah Proses Insert");
            rs = perintah.executeQuery("SELECT * FROM JURUSAN");
            i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i++);
                System.out.println("Kode Jurusan\t: "
                        + rs.getString("kode_jurusan"));
                System.out.println("Jurusan\t\t: "
                        + rs.getString("nama_jurusan"));
            }
// step 5: close connection
            koneksi.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver tidak ditemukan");
        } catch (SQLException e) {
            System.err.println("Error connection to database");
        }
    }

    public static void main(String[] args) {
        new percobaan_04();
    }
}
