public class Snake extends SuperAnimal{

   //constructor superclass
   public Snake(String name, int x, int y){
   
      super(name,x,y);
      
   }
   //getter  
   public String getName(){
      return "Snake";
   }       
   //methods
   public void talk(){
      System.out.println(getName() + " i'm gonna get you!");
   }
   public void makeSound(){
   }

}