public class MainKlasse{


   //Main - Det er dette der afg�re hvilken klasse der er vores hovede klasse 
   public static void main(String[]args){

   
   /*Opretter objekt - Her laver vi et objekt udfra vores underklasse s� vi 
   kan bruge dens funktioner*/
   SubKlasse sub = new SubKlasse();


   /*Kald metoder - Her kalder vi vi s� vores metoder fra vores underklasse 
   ved at skrive objekt navnet f�rst efterfulgt af metodens navn*/
   
   sub.minMetode();

   sub.minTegning();






   }


}