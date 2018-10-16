import java.util.*;  //Scanner & Random
public class Mines {  // Mineobjekt
   int m1X;
   int m1Y;
   int m2X;
   int m2Y;
   int m3X;
   int m3Y;
   int m4X;
   int m4Y;
   int m5X;
   int m5Y;
   int m6X;
   int m6Y;
   int m7X;
   int m7Y;
   int m8X;
   int m8Y;
   int m9X;
   int m9Y;
   int m10X;
   int m10Y;
   Random randomKoord = new Random();
 
   public void newMines() { // create10Mines
      m1X = randomKoord.nextInt(10)+1;
      if (m1X==1){
         m1Y = randomKoord.nextInt(9)+2;
      }else{
         m1Y = randomKoord.nextInt(10)+1;
      }
     
      m2X = randomKoord.nextInt(10)+1;
      if (m2X==1){
         m2Y = randomKoord.nextInt(9)+2;
      }else{
         m2Y = randomKoord.nextInt(10)+1;
      }
   
      m3X = randomKoord.nextInt(10)+1;
      if (m3X==1){
         m3Y = randomKoord.nextInt(9)+2;
      }else{
         m3Y = randomKoord.nextInt(10)+1;
      }
   
      m4X = randomKoord.nextInt(10)+1;
      if (m4X==1){
         m4Y = randomKoord.nextInt(9)+2;
      }else{
         m4Y = randomKoord.nextInt(10)+1;
      }
   
   
   
      m5X = randomKoord.nextInt(10)+1;
      if (m5X==1){
         m5Y = randomKoord.nextInt(9)+2;
      }else{
         m5Y = randomKoord.nextInt(10)+1;
      }
      m6X = randomKoord.nextInt(10)+1;
      if (m6X==1){
         m6Y = randomKoord.nextInt(9)+2;
      }else{
         m6Y = randomKoord.nextInt(10)+1;
      }
      m7X = randomKoord.nextInt(10)+1;
      if (m7X==1){
         m7Y = randomKoord.nextInt(9)+2;
      }else{
         m7Y = randomKoord.nextInt(10)+1;
      }
      m8X = randomKoord.nextInt(10)+1;
      if (m8X==1){
         m8Y = randomKoord.nextInt(9)+2;
      }else{
         m8Y = randomKoord.nextInt(10)+1;
      }
      m9X = randomKoord.nextInt(10)+1;
      if (m9X==1){
         m9Y = randomKoord.nextInt(9)+2;
      }else{
         m9Y = randomKoord.nextInt(10)+1;
      }
      m10X = randomKoord.nextInt(10)+1;
      if (m10X==1){
         m10Y = randomKoord.nextInt(9)+2;
      }else{
         m10Y = randomKoord.nextInt(10)+1;
      }
   
   }
   public boolean isMine(int x, int y){
      return (x==m1X && y==m1Y) || (x==m2X && y==m2Y)|| (x==m3X && y==m3Y) || (x==m8X && y==m8Y)|| (x==m4X && y==m4Y) || (x==m9X && y==m9Y)|| (x==m5X && y==m5Y) || (x==m10X && y==m10Y) || (x==m6X && y==m6Y) || (x==m7X && y==m7Y);
   
   }
 
 
}