import java.awt.Frame;
import java.awt.Button;
public class SecondFrame {
  public SecondFrame() {
    Frame fr = new Frame("Frame Kedua");
    Button btn = new Button("something");
    fr.setSize(200, 100);
    fr.setVisible(true);
  }

  public static void main(String[] args) {
    new SecondFrame();
  }

}
