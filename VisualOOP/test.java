import java.awt.Frame;
public class test {
  public test() {
    Frame fr = new Frame("Second Frame");
    fr.setSize(400, 300);
    fr.setVisible(true);
    }

  public static void main(String[] args) {
    new test();
  }
}