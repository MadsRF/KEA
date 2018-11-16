public class Course{


   private Lecturer teacher;
   private Student student;
   private Exam exam;


   public Course(Exam exam){

      teacher = new Lecturer();
      student = new Student();
      exam = new Exam();
   
   }
}