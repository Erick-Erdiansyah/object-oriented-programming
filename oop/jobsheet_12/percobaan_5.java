import java.io.IOException;

class SuatuKelas {
  public void methodA() {
    System.out.println("Method A");
  }

  public void methodB() throws IOException {
    System.out.println("Method B");
  }
}

public class percobaan_5 {
  public static void main(String[] args) {
    SuatuKelas obj = new SuatuKelas();
    obj.methodA();
    try {
      obj.methodB();
    } catch (IOException e) {
    }
  }
}
