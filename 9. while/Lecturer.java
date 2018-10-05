public class Lecturer{

   //atributter
   String   name;
   int      age;
   String   title;
   String   education;
   
   
   //metoder
   public void printLecturer(){
   
   System.out.println();
   System.out.println(title + name + " - " + age + " Years" + " - " + education);
   
   }

   public void setvalues(String newname, String newtitle, int newage, String neweducation){
   
   name      = newname;
   age       = newage;
   title     = newtitle;
   education = neweducation;
   
   }


}
