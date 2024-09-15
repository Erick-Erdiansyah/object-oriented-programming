/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_09;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import visual.Jobsheet_08.latihan;

/**
 *
 * @author erdia
 */
public class test {

    private boolean regDriver() {
        try {
            DriverManager.registerDriver(new Driver());
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    private Connection setConnection() throws SQLException {
        regDriver();
        String url = "jdbc:mysql://localhost:3306/polnep";
        String user = "root";
        String passwd = "";
        return DriverManager.getConnection(url, user, passwd);
    }

    private boolean Search(String param, String kode) {
        try {
            Statement stm = setConnection().createStatement();
            ResultSet rs = stm.executeQuery("select " + param + " from prodi where " + param + " = '" + kode+"'");
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public test() {
        System.out.println(Search("nama_prodi", "Teknik Listrik"));
    }

    public static void main(String[] args) {
        new test();
    }
}
