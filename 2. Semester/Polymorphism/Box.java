package Polymorphism;

public abstract class Box{

   protected double H;
   protected double L;
   protected double B;
   protected String QA;
   
   public void getType(){
     String className = this.getClass().getSimpleName();
     System.out.println(className); 
   }
}