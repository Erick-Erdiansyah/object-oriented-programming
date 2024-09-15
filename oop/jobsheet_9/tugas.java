class dinosaurus{
  private String jenis,makanan;
  private int usia,tinggi;

  public dinosaurus(String jenis,String makanan,int usia,int tinggi){
    this.jenis = jenis;
    this.makanan = makanan;
    this.usia = usia;
    this.tinggi = tinggi;
  }
  
  public String getJenis(){
    return jenis;
  } 
  public String getMakanan(){
    return makanan;
  } 
  public int getUsia(){
    return usia;
  } 
  public int getTinggi(){
    return tinggi;
  } 
}

class herbivora extends dinosaurus{

  public herbivora(String jenis, int usia, int tinggi) {
    super(jenis, "Tumbuhan", usia, tinggi);
  }

  public void makan(String tanaman){
    System.out.println(super.getJenis() +"  sedang makan tanaman "+tanaman);
  }
  
}

class karnivora extends dinosaurus{

  public karnivora(String jenis, int usia, int tinggi) {
    super(jenis,"Daging", usia, tinggi);
  }

    public void hunt(String buruan){
    System.out.println(super.getJenis()+" sedang berburu "+ buruan);
  }
  
}


public class tugas{
  public static void main(String[] args) {
    karnivora raptor = new karnivora("Velocyraptor",10,130);
    herbivora jerapah = new herbivora ("Jerapah", 20, 400);
    System.out.println("Mengamati dinosaurus");
    System.out.println();
    System.out.println("Nama dinosaurus : "+jerapah.getJenis());
    System.out.println("Makanan : "+jerapah.getMakanan());
    System.out.println("Perkiraan usia : "+jerapah.getUsia()+" tahun");
    System.out.println("Tinggi dinosaurus : "+jerapah.getTinggi()+" cm");
    jerapah.makan("durian");
    System.out.println();
    System.out.println("Nama dinosaurus : "+raptor.getJenis());
    System.out.println("Makanan : "+raptor.getMakanan());
    System.out.println("Perkiraan usia : "+raptor.getUsia()+" tahun");
    System.out.println("Tinggi dinosaurus : "+raptor.getTinggi()+" cm");
    raptor.hunt(jerapah.getJenis());
  }
}