import java.util.*;  //Scanner & Random
public class Mines2 {  // Mineobjekt    
   public void newMines(boolean[][] gameField) { // create10Mines i Array
    Random randomKoord = new Random();   
    int tmpX ;
    int tmpY;
    //Vi nulstiller minefeltet :-)
    for (int a=0;a<10;a++){
      for(int b=0;b<10;b++){
        gameField[a][b]=false;
      }
    }
    for (int x=1; x<=10;x++){
      tmpX = randomKoord.nextInt(10);
      if (tmpX==0){
        tmpY= randomKoord.nextInt(9)+1;        
      }else{
        tmpY= randomKoord.nextInt(10);        
      }
      if (tmpX==10){
        tmpY= randomKoord.nextInt(9);        
      }else{
        tmpY= randomKoord.nextInt(10);        
      }      
      gameField[tmpX][tmpY]=true;
    }
  }  
 }     
  
 