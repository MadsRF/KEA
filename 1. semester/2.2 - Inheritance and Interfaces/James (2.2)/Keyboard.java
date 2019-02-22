import java.util.Scanner;
public class Keyboard{
  private char keyStroke ='Q';
  private char[] quitSign;
  private boolean stop = false;
  private Scanner s = new Scanner(System.in);

  private void checkStop(){//intern metode der checkker op stoptegn er læst i metoderne
    if (quitSign != null){
      for (int cnt=0;cnt<quitSign.length;cnt++){
        if (keyStroke==quitSign[cnt]){
          stop=true;//vi har læst et STOP tegn!
        }
      }
    }     
  }
  public Keyboard(char[] quitSign){
    this.quitSign = quitSign;//liste med stoptegn indlæses
  }
  public Keyboard(){
    this.quitSign = null;//Der anvendes ikke quit-tegn.
    stop = true; //Så stop sættes true da den heller ikke anvendes!
  }
  public char nextChar(){
    this.keyStroke = s.next().charAt(0);//indlæs token (ignorer om token er mere end et tegn - vi ser tegn[0]
    checkStop();//sætter stop-boolean hvis et quittegn er læst;
    return this.keyStroke;
 
  }
   public boolean isStop(){
    return stop;
  }
  public void resetStop(){
    stop=false;
  }

  public boolean readMoveSetXYPos(int[] xyKoord,boolean diagonal){ //sætter XY altefter- keystroke (arrayet er en pointer
      boolean moveKey=false;
      
      this.keyStroke = s.next().charAt(0);
      checkStop();
      char key = keyStroke;
      
      if ((key=='a' ||key=='A' ||key=='4') || (diagonal && (key=='7' || key=='1'))){
        xyKoord[0]--;
        moveKey=true;
      }else{
        if ((key=='s' ||key=='S' ||key=='6') || (diagonal && (key=='9' || key=='3'))){
          xyKoord[0]++;
          moveKey=true;
          }
      }
      if ((key=='w' ||key=='W' ||key=='8') || (diagonal && (key=='7' || key=='9'))){
        xyKoord[1]++;
        moveKey=true;
      }else{
        if ((key=='z' ||key=='Z' ||key=='2') || (diagonal && (key=='1' || key=='3'))){
          xyKoord[1]--;
          moveKey=true;
          }
      } 
      
                       
    return moveKey;//indikerer at brugeren har trykket på en tast der er genkendt som en flyttetast.
  }


}