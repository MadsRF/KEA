public class Food{

   //attribut
   private String foodA;
   private String foodB;
   
   //construct
   public Food (String A, String B){
   
   foodA = A;
   foodB = B;
}

   //methods
   public String getFood(){
   
   //use return when a value is returned
   return "this is a " + foodA + " with a " + foodB;  
    
}
   
   public String getFood2(){
 
   return foodA + foodA;

}
      
   //void only if nothing is returned
   void print(){
   System.out.println("");
   System.out.println("Air");


}








}