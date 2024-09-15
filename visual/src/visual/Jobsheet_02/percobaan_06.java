package visual.Jobsheet_02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class percobaan_06 extends JFrame{
  public percobaan_06(){
    setSize(400, 300);
    setTitle("Title");
    addWindowListener(new peristiwa(this));
    setVisible(true);
  }
  public static void main(String[] args) {
    new percobaan_06();
  }
  class peristiwa extends WindowAdapter{
    percobaan_06 percobaan;
    peristiwa(percobaan_06 percobaan){
      this.percobaan = percobaan;
    }
    @Override
    public void windowClosing(WindowEvent e){
      dispose();
    }
  }
}
