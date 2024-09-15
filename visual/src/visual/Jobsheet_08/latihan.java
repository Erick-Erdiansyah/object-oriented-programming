/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_08;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erdia
 */
public class latihan {

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

    private void CreateMhs() {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Masukan NIM siswa :");
        String nim = input.nextLine();
        System.out.println("");
        System.out.print("Masukan nama siswa :");
        String nama = input.nextLine();
        System.out.println("");
        System.out.print("Masukan gender siswa :");
        String gender = input.nextLine();
        System.out.println("");
        System.out.print("Masukan kode prodi siswa :");
        String kode = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("insert into mhs values(?,?,?,?)");
            prpr.setString(1, nim);
            prpr.setString(2, nama);
            prpr.setString(3, gender);
            prpr.setString(4, kode);
            var i = prpr.executeUpdate();
            System.out.println("MAHASISWA BERHASIL DITAMBAHKAN");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ReadMhs() {
        Scanner input = new Scanner(System.in);

        try {
            Statement stm = setConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from mhs");
            ResultSetMetaData rsmt = rs.getMetaData();
            System.out.println("");
            System.out.println("NIM | NAMA | GENDER | KODE PRODI");
            while (rs.next()) {
                System.out.println(rs.getString(rsmt.getColumnName(1)) + " "
                        + rs.getString(rsmt.getColumnName(2)) + " "
                        + rs.getString(rsmt.getColumnName(3)) + " "
                        + rs.getString(rsmt.getColumnName(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void UpdateMhs() {
        Scanner input = new Scanner(System.in);
        String update;

        System.out.println("");
        System.out.print("masukan nim yang mahasiswa yang akan diupdate :");
        String updated = input.nextLine();

        System.out.println("");
        System.out.println("1 : NIM");
        System.out.println("2 : nama");
        System.out.println("3 : gender");
        System.out.println("4 : kode prodi");
        System.out.print("Apa yang ingin di update:");
        int pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1:
                update = "nim";
                break;
            case 2:
                update = "nama_mhs";
                break;
            case 3:
                update = "gender";
                break;
            case 4:
                update = "kode_prodi";
                break;
            default:
                throw new AssertionError();
        }
        System.out.print("masukan " + update + " :");
        String inp = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("update `mhs` set " + update + " = ? where `nim` = ?");
            prpr.setString(1, inp);
            prpr.setString(2, updated);
            var i = prpr.executeUpdate();
            System.out.println("MAHASISWA BERHASIL DI UPDATE");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void DeleteMhs() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("masukan NIM yang akan dihapus :");
        String delete = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("delete from `mhs` where nim = ?");
            prpr.setString(1, delete);
            var i = prpr.executeUpdate();
            System.out.println("MAHASISWA BERHASIL DI HAPUS");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CreateProdi() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukan kode prodi :");
        String kode = input.nextLine();
        System.out.println("");
        System.out.print("Masukan nama prodi :");
        String nama = input.nextLine();
        System.out.println("");
        System.out.print("Masukan singkatan prodi :");
        String singkatan = input.nextLine();
        System.out.println("");
        System.out.print("Masukan kode jurusan :");
        String kode_j = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("insert into prodi values(?,?,?,?)");
            prpr.setString(1, kode);
            prpr.setString(2, nama);
            prpr.setString(3, singkatan);
            prpr.setString(4, kode_j);
            var i = prpr.executeUpdate();
            System.out.println("PRODI BERHASIL DITAMBAHKAN");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ReadProdi() {
        Scanner input = new Scanner(System.in);

        try {
            Statement stm = setConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from prodi");
            ResultSetMetaData rsmt = rs.getMetaData();
            System.out.println("");
            System.out.println("KODE PRODI | NAMA | SINGKATAN | KODE JURUSAN");
            while (rs.next()) {
                System.out.println(rs.getString(rsmt.getColumnName(1)) + " "
                        + rs.getString(rsmt.getColumnName(2)) + " "
                        + rs.getString(rsmt.getColumnName(3)) + " "
                        + rs.getString(rsmt.getColumnName(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void UpdateProdi() {
        Scanner input = new Scanner(System.in);
        String update;

        System.out.println("");
        System.out.print("masukan kode prodi yang akan diupdate :");
        String updated = input.nextLine();

        System.out.println("");
        System.out.println("1 : kode prodi");
        System.out.println("2 : nama");
        System.out.println("3 : singkatan");
        System.out.println("4 : kode jurusan");
        System.out.print("Apa yang ingin di update:");
        int pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1:
                update = "kode_prodi";
                break;
            case 2:
                update = "nama_prodi";
                break;
            case 3:
                update = "singkatan";
                break;
            case 4:
                update = "kode_jurusan";
                break;
            default:
                throw new AssertionError();
        }
        System.out.print("masukan " + update + " :");
        String inp = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("update `prodi` set " + update + " = ? where `kode_prodi` = ?");
            prpr.setString(1, inp);
            prpr.setString(2, updated);
            var i = prpr.executeUpdate();
            System.out.println("PRODI BERHASIL DI UPDATE");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void DeleteProdi() {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("masukan kode prodi yang akan dihapus :");
        String delete = input.nextLine();
        try {
            PreparedStatement prpr = setConnection().prepareStatement("delete from `prodi` where kode_prodi = ?");
            prpr.setString(1, delete);
            var i = prpr.executeUpdate();
            System.out.println("PRODI BERHASIL DI HAPUS");
        } catch (SQLException ex) {
            Logger.getLogger(latihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean Run() {
        Scanner input = new Scanner(System.in);
        boolean run = false;
        if (regDriver() != false) {
            System.out.println("");
            System.out.println("OPSI PRODI");
            System.out.println("");
            System.out.println("1 : tambah prodi");
            System.out.println("2 : tampilkan seluruh prodi");
            System.out.println("3 : ubah data prodi");
            System.out.println("4 : hapus prodi");
            System.out.println("");
            System.out.println("OPSI MAHASISWA");
            System.out.println("");
            System.out.println("5 : tambah mahasiswa");
            System.out.println("6 : tampilkan seluruh mahasiswa");
            System.out.println("7 : ubah data mahasiswa");
            System.out.println("8 : hapus mahasiswa");
            System.out.println("9 : exit");
            System.out.print("Apa yang ingin anda lakukan :");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    CreateProdi();
                    run = true;
                    break;
                case 2:
                    ReadProdi();
                    run = true;
                    break;
                case 3:
                    UpdateProdi();
                    run = true;
                    break;
                case 4:
                    DeleteProdi();
                    run = true;
                    break;
                case 5:
                    CreateMhs();
                    run = true;
                    break;
                case 6:
                    ReadMhs();
                    run = true;
                    break;
                case 7:
                    UpdateMhs();
                    run = true;
                    break;
                case 8:
                    DeleteMhs();
                    run = true;
                    break;
                case 9:
                    run = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("database not found");
        }
        return run;
    }

    public latihan() {
        while (Run() != false) {
        }
    }

    public static void main(String[] args) {
        new latihan();
    }
}
