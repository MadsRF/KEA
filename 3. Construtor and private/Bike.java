import javax.swing.JOptionPane;

public class Bike{

   //attributter kan kun hentes i klassen
   private String model = "Blank";
   private int year = 0;
   private double cost = 00;
   private String description = "Blank";
   private String picture = "Blank";
   
   private String sound = "Silent";

   //Konstruktør - sætter default parametre for Bike
   public Bike(){

   this.model = "Not listed";
   this.year = 00;
   this.cost = 00;
   this.description = "Empty...";
   this.picture = "Insert Picture";
   
}
   
   /*OVERLOADING - Konstruktør til når vi vil have en motorcykel med forskellige 
   parametre så alle ikke skal være ens*/ 
   public Bike(String newmodel, int newyear, double newcost){

   this.model       = newmodel;
   this.year        = newyear;
   this.cost        = newcost;

         //Dialogbox afprøvning
         JOptionPane.showMessageDialog(null, "START");

}

   //Metode til udskrift af motorcykler
   public void BikeData(){
   
   System.out.println("Model: " + model + " Year: " + year + " Price: " + cost + " Dollars");
 
   System.out.println("Description: " + description);
   System.out.println("Picture: " + picture);  
   System.out.println("");
   
   
         //Dialogbox afprøvning
         JOptionPane.showMessageDialog(null, "NEXT");
   
}

   //Setter metode til at sætte motorcykel parametre
   public void SetBikeData(String newmodel, int newyear, double newcost, String newdescription, String newpicture){

   model       = newmodel;
   year        = newyear;
   cost        = newcost;
   description = newdescription; 
   picture     = newpicture;
   
}

   //metode til lyd af motorcykel
   public void BikeSound(){
   System.out.println(model + "\t Sounds:\t" + sound);
     
}

   //motorcykellyd OVERLOADING - nu med mulighed for at definer ny lyd 
   public void BikeSound(String newsound){
   
   this.sound = newsound;
   
   System.out.println(model + "\t Sounds:\t" + sound);
     
}


}