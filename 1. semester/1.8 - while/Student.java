public class Student{

   //attributter
   String name;
   String classes;
   int swdev;
   
   //metoder
   public void nextlesson(){
   
   //While loop - t�ller indtil den rammer 5
   while (swdev != 5){
   
   //ligger 1 til min variabel
   swdev = ++swdev;
   
   }// "if" betyder at hvis hvis min swdev rammer "5" s� bliver metoden udf�rt 
   if (swdev == 5){
   
   System.out.println("Student: " + name + " has completed: " + swdev + " " + classes);
   
   }
   }
   
   //S�tter at name er = med newname og henter til den f�rste metode 
   public void setvalues(String newname, String newclasses){
   
   name = newname;
   classes = newclasses;

   }

}


