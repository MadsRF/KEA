public class Rabbit extends SuperAnimal{

   
   //constructor superclass
   public Rabbit(String name, int x, int y){
   
   super(name,x,y);
   
   }
   //setter and getter
   public String getName(){
      return "rabbit";
   }
   public int getX(){
      return super.getX() + 1;
   }    
   public int getY(){
      return super.getY() + 1;
   }
   //methods
   public void animalMove(int x, int y){   
      
      x=r.nextInt(10)+2; 
      y=r.nextInt(10)+2;
   }           
   public void talk(){
      System.out.println(getName() + " HAHA, you got get me!");
   }
   public void makeSound(){
   }
}