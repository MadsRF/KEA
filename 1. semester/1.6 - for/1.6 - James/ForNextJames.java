import java.util.*;  //Inklud�r java's package! * Reges kap.3 :-)
public class ForNextJames {   //koden her er uden EGNE underklasser med objekter :-))
    
   public static void main (String[] args){
      
      int dice = -1; //Terningen er minus 1  s� vi ved om den har v�ret sl�et inden vi kigger p� den :-)
      Random r = new Random();//l�neobjekt fra Util-pakken!
      
      //Ex p� at man IKKE er bundet af at t�lle 1 op ad gangen (man bruger det dog normalt og gange s� bare sin t�ller op inde i loppet til det man skal bruge :-)
      System.out.println("Taelleren cntX behoever ikke foelge cntX++ - her taeller vi 2 op ad gangen");    
      for (int cntX=2; cntX <= 20; cntX=cntX+2){
         System.out.println("Her er cntX = "+ cntX);
      }
      
    
    
      //Computeren pr�ver 10 gange at sl� en sekser p� 3 slag
      for (int cntLoop1=1; cntLoop1<=10; cntLoop1++){
         System.out.print(cntLoop1+" gang faar vi: ");
         for (int cntRollDice=1; cntRollDice<=3; cntRollDice++){
            dice = r.nextInt(6)+1; //tilf�ldigt tal mellem 1 og seks
            System.out.print(" slag#"+cntRollDice +": " +dice);
            if (dice==6 ){
               System.out.println("<--- Her lykkedes det!!! :-)");
               break;//afbryd indre loop - n�r vi har en sekser beh�ver vi jo ikke flere fors�g!
            } else {
               if (cntRollDice>=3 & dice != 6){ //Vi har her en ifs�tning hvor BEGGE udsagn skal v�re opfyldt
                  System.out.println("<---- Ingen sekser her :-(");
               } //endif         
            }//endElse
         }
      }
   }  
}