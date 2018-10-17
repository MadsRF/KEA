public class BooleanEX{

   //atribut
   private String color;
   private String shape = "Trekant";
   
   //Constructor
   public BooleanEX(boolean color){
   
   /*hvis color er lig med true skal this.color = "Black" */
   
      if(color == true){
      this.color = "Black";
      }
   /*Hvis color er lig med False er this.color lig med "White"*/
      if(color == false){
      this.color = "White";
      }    
      
} 
   
   //methods
   public void getdata(){
   
   System.out.println("Hello " + color + " " + shape);
   
   }
   
}
