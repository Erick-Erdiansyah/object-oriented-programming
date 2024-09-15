public class poolPuzzleOne {
  public static void main(String[] args){
    int x = 0;

    while (x < 4){
      // ini ke print pertama dan selalu ke print setiap loop
      System.out.print("a");
      if (x < 1){
        // karena x masih 0 maka ini ke print
        System.out.print(" ");
      }
      // terus ini ke print setiap loop juga
      System.out.print("n");
      if (x < 1){
        // x masih 0 jadi ini ke print juga
        // dan disini loop pertama selesai karena dibawah mengunakan nilai x > 0
        System.out.print("oise");
        // 0 - 1 = -1
        x = x - 1;
      }
      if ( x == 1){
        // di loop ke 2 x bernilai 1 jadi dia kesini
        System.out.print("noys");
      }
      
      if (x > 1 ){
        // di loop ke 3 nilai x = 3 jadi kesini
        System.out.print(" oyster");
      }
      
      System.out.println();
      // loop pertama menghasilkan x = 1 
      x = x + 2;
    }
  }
}

// 1 jam lebih, fuck
