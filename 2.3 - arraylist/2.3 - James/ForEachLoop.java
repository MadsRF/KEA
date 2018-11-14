class ForEachLoop {
   public static void main(String[] arg) {
      int[] marks = { 125, 132, 95, 116, 110, 3330, 7, 132, 45 };
      int highestMarks = maximum(marks);
      System.out.println("The highest score is " + highestMarks); 
   }            
   public static int maximum(int[] numbers){
      int maxSoFar = numbers[0]; 
       // for each loop 
      for (int num : numbers){
         if (num > maxSoFar) { 
            maxSoFar = num; 
         } 
      } 
      return maxSoFar; 
   } 
}