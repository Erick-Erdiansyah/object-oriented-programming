class Parent{
  public int x= 5;
 }
 class Child extends Parent{
  public int x=10;
  public void info(int x){
  System.out.println("Nilai x sebagai parameter = "+x);
  System.out.println("Data member x di class Child = "+ this.x);
  System.out.println("Data member x di class Parent = " + super.x);
  }
 }
 public class percobaan_1 {
  public static void main(String[] args) {
    Child c = new Child();
    c.info(20);
    }
   }