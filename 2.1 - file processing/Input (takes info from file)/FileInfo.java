import java.io.*; // for File

public class FileInfo {

public static void main(String[] args) {

   //Choose file you want to I/O from
   File f = new File("hamlet.txt");

   //Shows if you can I/O from file, size and location 
   System.out.println("exists returns " + f.exists());
   System.out.println("canRead returns " + f.canRead());
   System.out.println("length returns " + f.length());
   System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
   }
}