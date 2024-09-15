class BioskopIndonesia{
  
  private String judul = "Judul Film",plot = "Plot Film";

  public void Setjudul(String judul){
      this.judul = judul;
  }

  public String Getjudul(){
    return judul;
  }

  public void Setplot(String plot){
      this.plot = plot;
  }

  public String Getplot(){
    return plot;
  }

  public void tampilan(){
    System.out.println("\nbioskop asli amerika");
    System.out.println("Judul dari Film yang sedang tayang adalah : "+judul);
    System.out.println("Plot dari Film tersebut : "+plot+"\n");
  }

}

class Unyil extends BioskopIndonesia{
  
  public Unyil(){
    
    Setjudul("Si Unyil Anak Petualang");
    
    Setplot("Si Unyil mengelilingi lautan untuk menjadi hokage");
    
  }

  public void tampilan(){
    System.out.println("bioskop asli amerika...Apakah ini itu itu ?");
    System.out.println("Judul dari Film yang sedang tayang adalah : "+Getjudul());
    System.out.println("Plot dari Film tersebut : "+Getplot());
  }
  
}
class AADC extends BioskopIndonesia{
  
  public AADC(){
    
    Setjudul("Ada Apa Dengan Cina");
    
    Setplot("Perjalanan astronot di mars");
    
  }
  
  public void tampilan(){
    System.out.println("bioskop asli amerika. bisa tidak bisa, tidak bisa juga bisa");
    System.out.println("Judul dari Film yang sedang tayang adalah : "+Getjudul());
    System.out.println("Plot dari Film tersebut : "+Getplot());
  }

}
class KCB extends BioskopIndonesia{
  
  public KCB(){
    
    Setjudul("Ketika Cangkul Bergerak");
    
    Setplot("Cangkul seorang kuli tani bergerak sendiri");
    
  }

  public void tampilan(){
    System.out.println("bioskop asli amerika, emoticon... {{{(>_<)}}} ");
    System.out.println("Judul dari Film yang sedang tayang adalah : "+Getjudul());
    System.out.println("Plot dari Film tersebut : "+Getplot());
  }

}
public class Latihan {
  public static void main(String[] args) {

    BioskopIndonesia bios = new BioskopIndonesia();
    KCB unyil = new KCB();

    bios.tampilan();
    unyil.tampilan();
    
  }  
}
