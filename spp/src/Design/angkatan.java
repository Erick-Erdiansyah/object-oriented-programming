package Design;

import com.mysql.cj.jdbc.Driver;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class angkatan extends javax.swing.JDialog {

    /**
     * Creates new form KelolaDataAngkatan
     */
    public angkatan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    boolean modeSimpan = true;
    boolean dupe;

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
        String url = "jdbc:mysql://localhost:3306/spp_1.1";
        String user = "root";
        String passwd = "";
        return DriverManager.getConnection(url, user, passwd);
    }

    private void Read() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            Statement stm = setConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from angkatan");
            ResultSetMetaData rsmt = rs.getMetaData();
            model.setRowCount(0);
            model.fireTableDataChanged();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(rsmt.getColumnName(1)), rs.getString(rsmt.getColumnName(2)),
                    rs.getString(rsmt.getColumnName(3)), rs.getString(rsmt.getColumnName(4))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(angkatan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean Search(String kode) {
        try {
            Statement stm = setConnection().createStatement();
            ResultSet rs = stm.executeQuery("select id_angkatan from angkatan where id_angkatan =" + kode);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(angkatan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_angkatan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        biaya = new javax.swing.JTextField();
        baru = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        angkatan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Kelola Data Angkatan");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Angkatan", "Angkatan", "Biaya", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setText("ID Angkatan");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        id_angkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_angkatanActionPerformed(evt);
            }
        });
        id_angkatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_angkatanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_angkatanKeyTyped(evt);
            }
        });

        jLabel3.setText("Angkatan");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setText("Semester");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        semester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                semesterKeyTyped(evt);
            }
        });

        jLabel5.setText("Biaya");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                biayaKeyTyped(evt);
            }
        });

        baru.setText("Baru");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        angkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkatanActionPerformed(evt);
            }
        });
        angkatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angkatanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angkatanKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_angkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(angkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(112, 112, 112)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(baru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batal))
                            .addComponent(biaya))
                        .addGap(230, 230, 230))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_angkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(angkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baru)
                    .addComponent(batal)
                    .addComponent(simpan)
                    .addComponent(ubah)
                    .addComponent(hapus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        modeSimpan = false;
        id_angkatan.setEnabled(true);
        id_angkatan.setEditable(false);
        angkatan.setEnabled(false);
        semester.setEnabled(true);
        semester.setEditable(false);
        biaya.setEnabled(true);
        biaya.requestFocus();
        baru.setEnabled(true);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        batal.setEnabled(true);
        hapus.setEnabled(false);
    }//GEN-LAST:event_ubahActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Read();
        id_angkatan.setEnabled(false);
        angkatan.setEnabled(false);
        semester.setEnabled(false);
        biaya.setEnabled(false);
        baru.setEnabled(true);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        batal.setEnabled(false);
        hapus.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        modeSimpan = true;
        id_angkatan.setEnabled(true);
        angkatan.setEnabled(false);
        semester.setEnabled(false);
        biaya.setEnabled(false);
        baru.setEnabled(false);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        batal.setEnabled(true);
        hapus.setEnabled(false);
    }//GEN-LAST:event_baruActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (id_angkatan.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "id angkatan tidak boleh kosong!", // isi pesan
                    "Informasi", // judul pesan
                    JOptionPane.INFORMATION_MESSAGE
            );
            id_angkatan.requestFocus();
        } else if (angkatan.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "angkatan tidak boleh kosong!", // isi pesan
                    "Informasi", // judul pesan
                    JOptionPane.INFORMATION_MESSAGE
            );
            angkatan.requestFocus();
        } else if (biaya.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "biaya tidak boleh kosong!", // isi pesan
                    "Informasi", // judul pesan
                    JOptionPane.INFORMATION_MESSAGE
            );
            semester.requestFocus();
        } else if (biaya.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "semester tidak boleh kosong!", // isi pesan
                    "Informasi", // judul pesan
                    JOptionPane.INFORMATION_MESSAGE
            );
            semester.requestFocus();
        } else {
            if (modeSimpan == true) { // save
                try {
                    PreparedStatement prpr = setConnection().prepareStatement("insert into angkatan values(?,?,?,?)");
                    prpr.setString(1, id_angkatan.getText());
                    prpr.setString(2, angkatan.getText());
                    prpr.setString(3, biaya.getText());
                    prpr.setString(4, semester.getText());
                    var i = prpr.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(angkatan.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else { // update
                try {
                    PreparedStatement prpr = setConnection().prepareStatement("update angkatan set biaya = ? where id_angkatan = ?");
                    prpr.setString(1, biaya.getText());
                    prpr.setString(2, id_angkatan.getText());
                    var i = prpr.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(angkatan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            batalActionPerformed(evt);
            Read();
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        id_angkatan.setEnabled(false);
        id_angkatan.setText("");
        angkatan.setEnabled(false);
        angkatan.setText("");
        semester.setEnabled(false);
        semester.setText("");
        biaya.setEnabled(false);
        biaya.setText("");
        baru.setEnabled(true);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        batal.setEnabled(false);
        hapus.setEnabled(false);
    }//GEN-LAST:event_batalActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Silahkan pilih salah satu baris yang akan dihapus!",
                    "Informasi",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            int pilihan = JOptionPane.showConfirmDialog(
                    this,
                    "Apakah yakin akan menghapus data?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION
            );
            if (pilihan == 0) { // tombol yes dipilih
                try {
                    PreparedStatement prpr = setConnection().prepareStatement("delete from angkatan where id_angkatan = ?");
                    prpr.setString(1, id_angkatan.getText());
                    var i = prpr.executeUpdate();
                    Read();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Data Jurusan Digunakan di Tabel lain");
                }
                batalActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Silahkan pilih salah satu baris yang diinginkan!",
                    "Informasi",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            id_angkatan.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            angkatan.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            biaya.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            semester.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            baru.setEnabled(false);
            simpan.setEnabled(false);
            ubah.setEnabled(true);
            batal.setEnabled(true);
            hapus.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void id_angkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_angkatanActionPerformed
        // fuck it, I can't delete this shit
    }//GEN-LAST:event_id_angkatanActionPerformed

    private void id_angkatanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_angkatanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dupe = Search(id_angkatan.getText());
            if (dupe == true) {
                dupe = false;
                int pilihan;
                pilihan = JOptionPane.showConfirmDialog(
                        this,
                        "data kosong atau kode jurusan " + id_angkatan.getText() + " sudah ada!"
                        + "Apakah anda ingin mengubah/menghapus data?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION);
                if (pilihan == 0) {
                    try {
                        Statement stm = setConnection().createStatement();
//                        ResultSet rs = stm.executeQuery("select id_kelas,nama_siswa,alamat,no_hp,id_angkatan from siswa where nisn =" + nisn.getText());
                        ResultSet rs = stm.executeQuery("select * from angkatan where id_angkatan =" + id_angkatan.getText());
                        ResultSetMetaData rsmt = rs.getMetaData();
                        while (rs.next()) {
                            angkatan.setText(rs.getString(rsmt.getColumnName(2)));
                            biaya.setText(rs.getString(rsmt.getColumnName(3)));
                            semester.setText(rs.getString(rsmt.getColumnName(4)));
                        }
                        id_angkatan.setEnabled(true);
                        id_angkatan.setEditable(false);
                        angkatan.setEnabled(false);
                        semester.setEnabled(true);
                        semester.setEditable(false);
                        biaya.setEnabled(true);
                        biaya.requestFocus();
                        baru.setEnabled(true);
                        simpan.setEnabled(false);
                        ubah.setEnabled(false);
                        batal.setEnabled(true);
                        hapus.setEnabled(false);
                        modeSimpan = false;
                    } catch (SQLException e) {
                        System.err.println("Query error");
                    }
                } else {
                    id_angkatan.setText("");
                    id_angkatan.requestFocus();
                }
            } else {
                angkatan.setEnabled(true);
                angkatan.requestFocus();
                semester.setEnabled(true);
                biaya.setEnabled(true);
                simpan.setEnabled(true);
            }
        }
    }//GEN-LAST:event_id_angkatanKeyReleased

    private void id_angkatanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_angkatanKeyTyped
        if (id_angkatan.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_id_angkatanKeyTyped

    private void semesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semesterKeyTyped
        if (semester.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_semesterKeyTyped

    private void biayaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biayaKeyTyped
        if (biaya.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_biayaKeyTyped

    private void angkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angkatanActionPerformed

    private void angkatanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angkatanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_angkatanKeyReleased

    private void angkatanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angkatanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_angkatanKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(angkatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(angkatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(angkatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(angkatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                angkatan dialog = new angkatan(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angkatan;
    private javax.swing.JButton baru;
    private javax.swing.JButton batal;
    private javax.swing.JTextField biaya;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id_angkatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField semester;
    private javax.swing.JButton simpan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
