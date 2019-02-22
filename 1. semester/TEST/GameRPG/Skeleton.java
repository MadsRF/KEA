public class Skeleton extends Monsters{

   public int getLife(){
      return super.defLife - 3;
   }
   public int getDamage(){
      return super.defDamage + 1;
   }
   public String getName(){
      return super.defName = "Skeleton Warrior";
   }

}