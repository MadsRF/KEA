public class Spider extends Monsters{

   public int getLife(){
      return super.defLife - 5;
   }
   public int getDamage(){
      return super.defDamage;
   }
   public String getName(){
      return super.defName = "Spider Hatchlin";
   }

}