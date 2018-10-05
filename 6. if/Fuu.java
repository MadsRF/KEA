public class Fuu{

 //attribut
   private String name;
   private int age;
   private int a;
   private int b;
   
   //construtor
   public Fuu(){
    
   this.age = 0;
   this.name = "null";
   this.a = 0;
   this.b = 0;
   
}
   //Overload construtor
   public Fuu(int age){
    
   this.age = age;
   this.name = name;
   this.a = 10;
   this.b = 5;
   
}
   
   //methods 1
   public void people(){
 
   if (age <= 30){
   
   System.out.println(age + " years old." + " This dude is young");

}
   
   else{
   
   System.out.println(age + " years old." + " This dude is old");
   
}
}

   //methods 2
   public String numbers(int a, int b){
   
   if (a != b){
   
   System.out.println(a + " is bigger than " + b);

}   
   else{
   
   System.out.println(a + " is smaller than " + b);
  
}
   if (a == b){
   
   System.out.println(a + " is equel to " + b); 

}
   else{
   
   System.out.println(a + " is not equel to " + b);

} 

   return System.out.println("congrats"); 
}



}
   

