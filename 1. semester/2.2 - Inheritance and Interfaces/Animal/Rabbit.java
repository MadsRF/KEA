public class Rabbit extends SuperAnimal{

   
   //constructor superclass
   public Rabbit(String name, int x, int y){
   
      super(name,x,y);
   
   }
   //overwrite setter and getter
   public String getName(){
      return "rabbit";
   }
   public int getX(){
      return super.getX() + 1;
   }    
   public int getY(){
      return super.getY() + 1;
   }
   //overwrite method from superclass   
   public void animalMove(int x, int y){   
      
      x=r.nextInt(10)+2; 
      y=r.nextInt(10)+2;
   }   
   //overwrite method from superclass         
   public void talk(){
      System.out.println(getName() + " HAHA, you got get me!");
   }
   
   //is a abstract method from superclass. needs to be here to work (can be empty)
   public void makeSound(){
      int i;
      for(i = 0; i < 3; i++){ 
         System.out.println("YAAAAAAAAAAAAAAHHHH!!!!");
      }
   }
   
   
}