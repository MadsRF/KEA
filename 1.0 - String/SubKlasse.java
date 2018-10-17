public class SubKlasse{


   /*Attributter - dette er vores datatype og variable værdi som fortæller, 
   hvilken data vores klasse kan gøre brug af*/
   String navn = "Hans";
   int alder = 10;
   double penge = 15.5;
   boolean ja = true;


   /*Metoder - Det er gennem metoderne vi styrer data og processer 
   vi ønsker der skal udføres på vores objekt*/   
   public void minMetode(){
   System.out.println(navn + " er " + alder + " aar. " + "han har " + penge + " kr. " + "er det rigitgt? " + ja); 
   }
   
   
   public void minTegning(){
   System.out.println();
   System.out.println("Dette er Hans's seje tegning:");   
   System.out.println();
   System.out.println(" +----+");
   System.out.println("||    ||");
   System.out.println(" |----|"); 
   System.out.println(" |    |");
   System.out.println(" |____|");
   System.out.println("||    ||");
   System.out.println(" |____|");
   System.out.println("  x  x  ");
   }







}