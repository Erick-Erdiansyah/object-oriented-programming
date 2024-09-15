package visual.Jobsheet_02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class percobaan_05 extends JFrame implements WindowListener {
  public percobaan_05 () {
    setSize(400, 300);
    setTitle("Percobaan5");
    addWindowListener(this);
    setVisible(true);
    }

  public static void main(String args[]) {
    new percobaan_05();
  }

  @Override
  public void windowOpened(WindowEvent e) {
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
  }

  @Override
  public void windowIconified(WindowEvent e) {
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
  }

  @Override
  public void windowActivated(WindowEvent e) {
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
  }

}
