import java.util.*;

public class NewBomb {  

   //Methods - Makes 10 Mines using array
   public void bombs (boolean[][] gF) {
      Random RandK = new Random();   
      int tmpX;
      int tmpY;
    
    //Reset mine fields
      for (int a=0;a<5;a++){
         for(int b=0;b<5;b++){
            gF[a][b]=false;
         }
      }
    //Random input for mines    
      for (int x=1; x<=5;x++){
         tmpX = RandK.nextInt(5);
         if (tmpX==0){
            tmpY= RandK.nextInt(4)+1;        
         }else{
            tmpY= RandK.nextInt(5);        
         }
         if (tmpX==10){
            tmpY= RandK.nextInt(4);        
         }else{
            tmpY= RandK.nextInt(5);        
         }      
         gF[tmpX][tmpY]=true;
      }
   }  
}     
  
