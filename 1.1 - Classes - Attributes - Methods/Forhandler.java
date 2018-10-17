public class Forhandler{

public static void main(String[] args)  {

//Forskellige biler
   Mercedes merc1 = new Mercedes();
   Mercedes merc2 = new Mercedes();
   Mercedes merc3 = new Mercedes();
   Mercedes merc4 = new Mercedes();
   
//sæt attributer for biler
   merc1.navn = "E-klasse";
   merc1.model = 212;
   merc1.alder = 5.2;
   merc1.farve = "Orange";
 
   merc2.navn = "S-klasse";
   merc2.model = 221;
   merc2.alder = 3.1;
   merc2.farve = "Sort";
   
   merc3.navn = "";
   merc3.model = 1;
   merc3.alder = 1;
   merc3.farve = "";
 
   merc4.navn = "";
   merc4.model = 1;
   merc4.alder = 1;
   merc4.farve = "";
   
//udskriv merc1
   System.out.println("Navn:\t\t" + merc1.navn);
   System.out.println("Farve:\t" + merc1.farve + "");
   System.out.println("Model:\t" + merc1.model + "");
   System.out.println("Alder:\t" + merc1.alder + " Years");
 
   System.out.println("---------");
   
//udskriv merc2
   System.out.println("Navn:\t\t" + merc2.navn);
   System.out.println("Farve:\t" + merc2.farve + "");
   System.out.println("Model:\t" + merc2.model + "");
   System.out.println("Alder:\t" + merc2.alder + " Years");

  
   }
   
   }