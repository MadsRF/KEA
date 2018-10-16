import java.util.Random;

public class Studentlist{

   //Attributter
   private int people = 0;
   private int sick = 0;
   private String teachername = "blank";
   Random rand = new Random();
  
   //Konstrutør
   public Studentlist(int people){
   
   this.people = people;
   this.sick = sick;
   
}   
     
   //Print metode
   public void Studentprint(){
   
   System.out.println("Amount in class: " + people); 

}   

   //if/random metode
   public void Sick(){
   
   if (sick < 15){
   int random = rand.nextInt(30) + 1; 
   sick = sick + random;
   System.out.println("There are this many absent: " + random);
 
   if (sick > 10){
   System.out.println("Too many sick, we'll stay home today");

}   
}
}

   


}  