import java.util.Random;
public class Snake extends Animal {
   Random r = new Random();

   public Snake(int x, int y, String name){//konstrukt�ren SKAL erkl�res dan den default er uden parameter duer det ikke - den skal v�re sammenfaldende med supers;
      super(x,y,name);
   }
   
   public void hunt(int agression, int[] pos){// vi kalder med kaninens koordinater og beregner retning mod kaninen
      int[] xyPos = getPos();
   
      if (isWithinRange(agression,pos)){ // Hvis slangen har f�rten jages m�lrettet ellers flyttes random!
      
         if (xyPos[0]>pos[0]){
            xyPos[0]--;
         }else{
            if (xyPos[0]<pos[0]){
               xyPos[0]++;
            }
         }  
         if (xyPos[1]>pos[1]){
            xyPos[1]--;
         }else{
            if (xyPos[1]<pos[1]){
               xyPos[1]++;
            }
         }
      }else{ //slangen er ikke t�t nok p� til at registre kaninen og flytter i stedet tilf�ldigt
         if (r.nextBoolean()) {
            xyPos[0]++;
         }else{
            xyPos[0]--;
         }
         if (r.nextBoolean()) {
            xyPos[1]++;
         }else{
            xyPos[1]--;
         }
      }
   
      setPos(xyPos);
   }
}