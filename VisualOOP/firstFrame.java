import java.awt.Frame;

public class firstFrame extends Frame {
  public firstFrame() {
    setSize(100, 100);
    setTitle("Frame Pertama");
    setVisible(true);
  }

  public static void main(String args[]) {
    new firstFrame();
  }
}
