/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_08;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erdia
 */
public class percobaan_03 {

    private boolean regDriver() {
        try {
            DriverManager.registerDriver(new Driver());
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public void setConnection(){
            
    }
    
    public percobaan_03() {
        regDriver();
        try {
            String url = "jdbc:mysql://localhost:3306/polnep";
            String user = "root";
            String passwd = "";
            java.sql.Connection con = DriverManager.getConnection(url, user, passwd);
            //command / query
            Statement command = con.createStatement();
            // do command
            command.executeUpdate("insert into jurusan values('6','Teknologi Informasi')");
        } catch (SQLException ex) {
            Logger.getLogger(percobaan_03.class.getName()).log(Level.SEVERE, "you fucked up", ex);
        }
    }

    public static void main(String[] args) {
        new percobaan_03();
    }
}
