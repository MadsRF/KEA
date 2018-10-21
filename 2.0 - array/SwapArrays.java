import java.util.*;

public class SwapArrays {

   //Attributs
   static int temp;

   public static void main(String [] args){
   
      //Objects
      int[] a1 = {1, 2, 3, 1};
      int[] a2 = {10, 20, 30};
      int[] a3 = {100, 200, 300};
      
      //Print normal
      System.out.println(Arrays.toString(a1)); //1, 2, 3
      System.out.println(Arrays.toString(a2)); // 10, 20, 30
      System.out.println(Arrays.toString(merge2(a1,a2))); // 1, 2, 3, 10, 20, 30
      System.out.println(Arrays.toString(merge3(a1,a2,a3))); // 1, 2, 3, 10, 20, 30, 100, 200, 300 RETURNS BY HELP OF MERGE2 (SMART)
      //System.out.println(Arrays.toString(merge4(a1,a2,a3))); // 1, 2, 3, 10, 20, 30, 100, 200, 300 NORMAL VERSION TO RETURN ARRAYS 
      
      System.out.println("-------------");
      
      //Methods call
      swap(a1, 1, 2);
      swapAll(a1, a2);   
   
      //Print switch
      System.out.println(Arrays.toString(a1)); // 10, 20, 30
      System.out.println(Arrays.toString(a2)); //1, 2, 3
      System.out.println(Arrays.toString(merge2(a1,a2))); // 10, 20, 30, 1, 2, 3
      System.out.println(Arrays.toString(merge3(a1,a2,a3))); // 10, 20, 30, 1, 2, 3, 100, 200, 300
   }
   //Method to swap 2 values in array
   public static void swap(int[] a, int x, int y){
      temp = a[x];
      a[x] = a[y];
      a[y] = temp;  
   }
   //Method to swap the entire content of 2 arrays
   public static void swapAll(int[]a, int[] b) {
      
      int max = Math.min(a.length, b.length);
      for(int i = 0; i< max; i++) {
         temp = a[i];
         a[i] = b[i];
         b[i] = temp;   
      }
   }
   //Method to merge 2 arrays 
   public static int[] merge2(int[] a, int[] b){
   
      int[] result = new int[a.length + b.length];
      for (int i = 0; i < a.length; i++) {
         result[i] = a[i];
      }
      for (int i = 0; i < b.length; i++) {
         result[a.length + i] = b[i];
      }
      return result;
   } 
   //Method to merge 3 arrays using return from merging 2 arrays  
   public static int[] merge3(int[] a, int[] b, int[]c){
      return merge2(merge2(a, b), c);
   }
   //Method to merge 3 arrays without using the return from merge2
   public static int[] merge4(int[] a, int[] b, int[] c){
   
      int[] result2 = new int[a.length + b.length + c.length];
      for (int i = 0; i < a.length; i++) {
         result2[i] = a[i];
      }
      for (int i = 0; i < b.length; i++) {
         result2[a.length + i] = b[i];
      }
      for (int i = 0; i < c.length; i++) {
         result2[a.length + b.length + i] = c[i];
      }
      return result2;
   }
}
