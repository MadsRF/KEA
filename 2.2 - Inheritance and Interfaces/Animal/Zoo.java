public class Zoo{
   
   public static void main(String []args){
   
      int count = 0;
      
      //normal object
      Snake snake = new Snake("foo", 1,1);
      
      //objects using polymorphism
      SuperAnimal rabbit = new Rabbit("fuu", 9,9);
      
      /*Object method can't be done when class is abstract
      Object a = new SuperAnimal();*/ 
      
      //typecast - when class extends and have a methods that dosen't exixt in Super
      ((Rabbit) rabbit).makeSound();
      
      //shows start position
      System.out.println(rabbit.getName() + ": " + rabbit.getX() + "," + rabbit.getY());
      System.out.println(snake.getName() + ": " + snake.getX() + "," + snake.getY());
      
      //Program run   
      while(rabbit.getX() != snake.getX() | rabbit.getY() != snake.getY()){
         
         //counter of while loops  
         count++;   
         //methods call to make animals move
         snake.animalMove();
         rabbit.animalMove();
         
         //print what happens 
         System.out.println(rabbit.getName() + ": " + rabbit.getX() + "," + rabbit.getY());
         System.out.println(snake.getName() + ": " + snake.getX() + "," + snake.getY());
         
            //if snake catches rabbit
            if(rabbit.getX() == snake.getX() & rabbit.getY() == snake.getY()){
               rabbit.talk();
            }
            //if snake is near rabbit
            else if(rabbit.getX() == snake.getX()+1 & rabbit.getY() == snake.getY()+1){
               snake.talk();
            }
      
      }
      //print to tell how many turns it took.
      System.out.println("it took: ("+count+") turns for the snake to catch the rabbit");
   }
}