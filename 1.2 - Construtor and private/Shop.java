public class Shop{


   public static void main(String [] args){
   
   //Objekter fra klassen Bike:
   Bike bike1 = new Bike();
   Bike bike2 = new Bike();
   
   //OVERLOADING af konstruktør
   Bike bike3 = new Bike("BMW",1975,80000);
   
   //Udskriv standard data til motorcykel:
   bike1.BikeData();
      
   //Indsæt data til motorcykel:
   bike1.SetBikeData("Yahama",1991,14999,"This is a nice bike","0/\\0");
   bike2.SetBikeData("Suzuki",2000,21000,"Good bike","00//\\\\00");
   
   //Udskriv nye data til oprettet motorcykel:
   bike1.BikeData();
   bike2.BikeData();
   bike3.BikeData();
   
   //OVERLOADING af metode
   bike1.BikeSound();
   bike1.BikeSound("Wreoom!");
   bike2.BikeSound("HONK!");
   bike3.BikeSound("Idle");
   
         
}







}