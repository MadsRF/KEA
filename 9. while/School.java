public class School {

   public static void main (String[] args){
 
   //Laver objekter
   Student stu1 = new Student();
   Student stu2 = new Student(); 
   Lecturer Lec1 = new Lecturer();
 
   //student values
   stu1.setvalues("Mads Frederiksen","ITO Classes");
   stu2.setvalues("Anders Andersen","Software Classes");

   //printvalues
   stu1.nextlesson();
   stu2.nextlesson();   
   
   //lecturer values     
   Lec1.setvalues(" Hans Otto Andersen","Proffessor",45,"KEA");
   
   //printvalues
   Lec1.printLecturer();
   
   }


}