class idk{
  private String name;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
}

public class kon_ {
  public static void main(String[] args) {
    idk idk = new idk();
    idk.setName("your name is something someone used to know");
    System.out.println(idk.getName());
  }
}