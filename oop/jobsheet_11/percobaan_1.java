abstract class Bentuk {
  String color;

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return this.color;
  }

  abstract float getArea();
}

class Segitiga extends Bentuk {
  private float base;
  private float height;

  public Segitiga(int base, int height) {
    this.base = base;
    this.height = height;
  }

  @Override
  float getArea() {
    return 0.5f * base * height;
  }
}

class Lingkaran extends Bentuk {
  private float radius;

  public Lingkaran(float radius) {
    this.radius = radius;
  }

  @Override
  float getArea() {
    return (float) (Math.PI * radius * radius);
  }
}

public class percobaan_1 {
  public static void main(String[] args) {
    Bentuk segitiga = new Segitiga(4, 6);
    Bentuk lingkaran = new Lingkaran(10);
    System.out.println("Luas Segitiga: " +
        segitiga.getArea());
    System.out.println("Luas Lingkaran: " +
        lingkaran.getArea());
  }
}
