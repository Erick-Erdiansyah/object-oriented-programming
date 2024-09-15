package visual.Jobsheet_02;

import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class percobaan_04 extends JFrame {
  public percobaan_04(){
    setSize(400, 300);
    setTitle("Percobaan 4");
    // anon class
    addWindowListener(new WindowAdapter(){
      @Override
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
    setVisible(true);
  }
  public static void main(String[] args) {
    new percobaan_04();
  }
}
