import java.util.Scanner;

class televisi{
  private String IO;
  private int volume,channel;

  public void setIO(String iO) {
    this.IO = iO;
  }
  public void setChannel(int channel) {
    this.channel = channel;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }
  public String getIO(){
    return IO;
  }
  public int getChannel() {
    return channel;
  }
  public int getVolume() {
    return volume;
  }
}
public class Latihan{
  public static void main(String[] args) {
    televisi tv = new televisi();
    Scanner input = new Scanner(System.in);
    String kondisi = tv.getIO();
    int control,in;
    String tipi;

    try {
      System.out.print("Nyalakan TV ? y/n ? ");
      kondisi = input.nextLine();
    } catch (Exception e) {
      System.out.println("salah input");
    }

    if(!kondisi.equalsIgnoreCase("y")){
      System.out.println("Bye bye");
    }
    tv.setIO(kondisi);
    while (!kondisi.equalsIgnoreCase("n")) {
      if (!kondisi.equalsIgnoreCase("n")) {
        tipi = "Mati";
      }
      tipi = "Nyala";

      System.out.println("INI BUKAN TV ANDA");
      System.out.println("tv saat ini sedang dalam keadaan : "+ tipi);
      int volume = tv.getVolume();
      System.out.println("volume tv saat ini : "+volume);
      int channel = tv.getChannel();
      System.out.println("anda sekarang berada di channel : " + channel);

      System.out.println("[1] Matikan tv");
      System.out.println("[2] ubah volume");
      System.out.println("[3] ubah channel");
      System.out.println();
      control = input.nextInt();
      input.nextLine();
      if (control == 1) {
        kondisi = "n";
      } else if (control == 2) {
        System.out.println("Volume Maksimal 100");
        in = input.nextInt();
        tv.setVolume(in);
      } else{
        System.out.println("Channel Maksimal 10");
        in = input.nextInt();
        tv.setChannel(in);
      }
    }
      input.close();
  }
}