public class Orc extends Monsters{

   public int getLife(){
      return super.defLife - 2;
   }
   public int getDamage(){
      return super.defDamage + 2;
   }
   public String getName(){
      return super.defName = "Orc Wizzard";
   }
}