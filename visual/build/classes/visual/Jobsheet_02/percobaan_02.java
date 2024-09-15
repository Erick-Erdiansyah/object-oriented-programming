package visual.Jobsheet_02;

import java.awt.Color;

import javax.swing.JFrame;

public class percobaan_02 {
  public percobaan_02(){
    JFrame jf = new JFrame("fuck this shit");
    jf.setSize(400, 300);
    jf.getContentPane().setBackground(Color.BLUE);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    new percobaan_02();
  }
}
