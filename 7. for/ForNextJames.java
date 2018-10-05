import java.util.*;  //Inkludér java's package! * Reges kap.3 :-)
public class ForNextJames {   //koden her er uden EGNE underklasser med objekter :-))
    
   public static void main (String[] args){
      
      int dice = -1; //Terningen er minus 1  så vi ved om den har været slået inden vi kigger på den :-)
      Random r = new Random();//låneobjekt fra Util-pakken!
      
      //Ex på at man IKKE er bundet af at tælle 1 op ad gangen (man bruger det dog normalt og gange så bare sin tæller op inde i loppet til det man skal bruge :-)
      System.out.println("Taelleren cntX behoever ikke foelge cntX++ - her taeller vi 2 op ad gangen");    
      for (int cntX=2; cntX <= 20; cntX=cntX+2){
         System.out.println("Her er cntX = "+ cntX);
      }
      
    
    
      //Computeren prøver 10 gange at slå en sekser på 3 slag
      for (int cntLoop1=1; cntLoop1<=10; cntLoop1++){
         System.out.print(cntLoop1+" gang faar vi: ");
         for (int cntRollDice=1; cntRollDice<=3; cntRollDice++){
            dice = r.nextInt(6)+1; //tilfældigt tal mellem 1 og seks
            System.out.print(" slag#"+cntRollDice +": " +dice);
            if (dice==6 ){
               System.out.println("<--- Her lykkedes det!!! :-)");
               break;//afbryd indre loop - når vi har en sekser behøver vi jo ikke flere forsøg!
            } else {
               if (cntRollDice>=3 & dice != 6){ //Vi har her en ifsætning hvor BEGGE udsagn skal være opfyldt
                  System.out.println("<---- Ingen sekser her :-(");
               } //endif         
            }//endElse
         }
      }
   }  
}