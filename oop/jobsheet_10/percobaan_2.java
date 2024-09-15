class lingkaran{
  private float r;
  private double  d,luas;

  public void HitungLuas(float jarijari){
    r = jarijari;
    luas = Math.PI * r * r;
    System.out.println("Luas Lingkaran" + luas);
  }
  public void HitungLuas(double dimensi){
    d = dimensi;
    luas = (Math.PI *d * d) / 4;
    System.out.println("Luas Lingkaran" + luas);
  }

}
public class percobaan_2{
  public static void main(String[] args) {
    lingkaran l = new lingkaran();
    l.HitungLuas(10f);
    l.HitungLuas(20d);
  }
}