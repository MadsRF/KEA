import java.util.* ;
class ArrayFun {  
 public static void main(String args[]){
   String[] a = {"al", "xbob", "cari", "dan", "mike"};
   
   int index = Arrays.binarySearch(a, "dan");  // ex på hvordan vi finder index-nr på en forespørgsel (hvis den findes :-)) 3


  //Java's TreeSet/Map use compareTo internally for ordering.

  Set<String> set = new TreeSet<String>();
  for (String s : a) {
      set.add(s);
  }
  System.out.println(set); // [al, cari, dan, mike, xbob] xbob er flyttet til sidst :-)
 
 
 }
}