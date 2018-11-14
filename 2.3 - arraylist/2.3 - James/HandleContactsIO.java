
import java.io.*;
import java.util.*;

class HandleContactsIO { 

 private ArrayList<MyContacts> contactList = new ArrayList<MyContacts>();//arrayliste til vores kontakter;
 private String fileName= "contacts.dat";
  
 public HandleContactsIO(){ //konstruktøren loader fil (hvis den findes)
   
   int a = 0;
   try {
         File fileIn = new File(fileName);
         Scanner in = new Scanner(fileIn);
         while (in.hasNext()){//så længe filen har data:
           MyContacts id = new MyContacts();
           
           id.firstName=in.next();
           id.lastName=in.next();
           id.age=in.nextInt();
           id.phoneNumber=in.next();
           id.emailAdress=in.next();
           contactList.add(id);           
         }
         //loopslut
         in.close(); //Close stream!
         
      }catch(IOException i) {
         i.printStackTrace();
         return;
      }
  }
  public boolean saveContacts(){
    
    try {
        File fileOut = new File(fileName);
        PrintStream out = new PrintStream(fileOut);
        for (MyContacts id : contactList){
          out.println(id.firstName);
          out.println(id.lastName);
          out.println(id.age);
          out.println(id.phoneNumber);
          out.println(id.emailAdress);
        }
        out.close();
        
      }catch(IOException i) {
      System.out.println("Fejl ved skrivning til fil!");
      return false;
    }
   return true;
 }
 
 public void showContacts(){
  int cnt = 0;
  for (MyContacts id : contactList){
   
   System.out.println("INDEX# "+cnt);
   cnt++;  
   System.out.println(id.firstName+" "+id.lastName);
   System.out.println(id.age+" aar");
   System.out.println("tel.: "+id.phoneNumber);
   System.out.println("mail: "+id.emailAdress+"\n");
  }
 }
 public void editContact(int index){
 
 
 }
 public void deleteContact(int index){
   this.contactList.remove(index);
 }
 public void addContact(MyContacts id){
   this.contactList.add(id);
 }


}