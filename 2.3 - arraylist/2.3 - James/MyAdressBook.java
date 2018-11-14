import java.util.*;
class MyAdressBook{

  public static void main( String args[]){
    Boolean stop = false;
    Scanner userInput = new Scanner(System.in);
    String input ="";
    HandleContactsIO arrayId = new HandleContactsIO();
    
    do{
     arrayId.showContacts();
     System.out.println("Vælg: \n [1] tilføje kontakt \n [2] slette kontakt \n [3] afslut");
     input = userInput.next();
     if (input.equals("3")){
       stop=true;
     }else{
       if (input.equals("1")){
         MyContacts id = new MyContacts();
         System.out.print("Fornavn: ");
         id.firstName = userInput.next();
         System.out.print("Efternavn: ");
         id.lastName = userInput.next();
         System.out.print("alder: ");           
         id.age=userInput.nextInt();//ingen test :-)
         System.out.print("tlf.nr: ");  
         id.phoneNumber = userInput.next();
         System.out.print("mailadr: ");  
         id.emailAdress = userInput.next();
         arrayId.addContact(id);//føj til arraylist'en
         
       }
       if (input.equals("2")){
         System.out.print("Hvad for et index skal slettes? : ");
         arrayId.deleteContact(userInput.nextInt());
       }
        
     }
     
    }while (!stop);
   
    if (arrayId.saveContacts()){
      System.out.println("Fil gemt - OK!");
    }else{
      System.out.println("I/O FEJL data IKKE gemt!");
    }


  }

}