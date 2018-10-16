public class TabelJames {     
  public static void main (String[] args){
    System.out.println("Dat18-B :: Den lille Tabel");
    for (int x=1; x<=10;x++){
      System.out.println();
      for (int y=1;y<=10;y++){
        if (x*y<10){
          System.out.print(" ");
        }
        System.out.print(" "+x*y); 
      }//end loop y
    }//end loop x
  }  
}