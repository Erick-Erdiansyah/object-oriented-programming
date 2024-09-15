package visual.Jobsheet_02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class percobaan_08 extends JFrame {
  public percobaan_08(){
    JPanel jp = new JPanel();
    jp.setBounds(20, 20, 40, 30);
    jp.setBackground(Color.BLACK);
    add(jp);
    setSize(400, 300);
    setTitle("getTitle()");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
