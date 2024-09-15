class test {
  public static void main(String[] args){
    int x = 0;
    int y = 0;
    while (x < 5) {
      // y = x - y; // 4/2
      
      y = y + x;  // 4/10
      y = y + x;  // 4/10
      
      y = y + 2;
      if (y > 4 ){
        y = y - 1;
      } // 4/7
      
      x = x + 1; // sambungan dibawah
      y = y + x;  // 5/7
      
      // if (y < 5){
      //   x = x + 1;
      //   if (y < 3){
      //     x = x - 1;
      //   }
      // }
      // y = y + 2; // 4/8
      
      System.out.println(x + " " + y + " ");
      x = x + 1;
    }
  }
}
