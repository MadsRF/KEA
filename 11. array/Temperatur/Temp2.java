import java.util.*;

public class Temp2 {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);   
      //asks how many days you want
      System.out.print("how many days' temperatures? ");
      int numDays = console.nextInt();
      int[] temps = new int[numDays];
      
      //records temp and average
      int sum = 0;
      for (int i = 0; i < numDays; i++) {
         System.out.print("Day " + (i + 1) + "'s high temp; ");
         temps[i] = console.nextInt();
         sum += temps[i];
      }
      double average = (double) sum / numDays;  
      //Days above average
      int above = 0;
      for (int i = 0; i < temps.length; i++) {
         if (temps[i] > average) {
            above++;
         }
      }
      //results 
      System.out.println();
      System.out.println("Average = " + average);
      System.out.println(above + " days above average");
   }
}