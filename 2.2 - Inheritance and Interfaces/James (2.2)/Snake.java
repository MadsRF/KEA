import java.util.Random;
public class Snake extends Animal {
   Random r = new Random();

   public Snake(int x, int y, String name){//konstruktøren SKAL erklæres dan den default er uden parameter duer det ikke - den skal være sammenfaldende med supers;
      super(x,y,name);
   }
   
   public void hunt(int agression, int[] pos){// vi kalder med kaninens koordinater og beregner retning mod kaninen
      int[] xyPos = getPos();
   
      if (isWithinRange(agression,pos)){ // Hvis slangen har færten jages målrettet ellers flyttes random!
      
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
      }else{ //slangen er ikke tæt nok på til at registre kaninen og flytter i stedet tilfældigt
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