package Polymorphism;

public class Mani{

   public static void main(String[] args){
   
      Simple sim = new Simple();
      Wooden woo = new Wooden();
      Steel ste = new Steel();    
   
      sim.getType();
      woo.getType();
      ste.getType();
   
   }
}