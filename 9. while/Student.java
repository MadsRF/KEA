public class Student{

   //attributter
   String name;
   String classes;
   int swdev;
   
   //metoder
   public void nextlesson(){
   
   //While loop - tæller indtil den rammer 5
   while (swdev != 5){
   
   //ligger 1 til min variabel
   swdev = ++swdev;
   
   }// "if" betyder at hvis hvis min swdev rammer "5" så bliver metoden udført 
   if (swdev == 5){
   
   System.out.println("Student: " + name + " has completed: " + swdev + " " + classes);
   
   }
   }
   
   //Sætter at name er = med newname og henter til den første metode 
   public void setvalues(String newname, String newclasses){
   
   name = newname;
   classes = newclasses;

   }

}


