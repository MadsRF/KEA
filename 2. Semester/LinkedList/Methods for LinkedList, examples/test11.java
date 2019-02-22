import java.util.*;

public class test11 {


	public static void main(String[] args){
		String[] things = {"eggs", "apples", "lemons", "bananas", "grapes", "steaks"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x: things){
			list1.add(x);
		}
		
		String[] morethings = {"pineapples", "blueberry", "strawberry"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y: morethings){
			list2.add(y);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println();
		
		//add list2 to list1, empty list2, new line
		list1.addAll(list2);
	    System.out.println(list1);
	    
		
		System.out.println();
		
		printMe(list1);

		removeStuff(list1, 2, 5);
		reverseMe(list1);
		
	}
	
	// printMe method
	private static void printMe(List<String> L){
		System.out.print(L);
		System.out.println();
	}

	
	//removeStuff method
	private static void removeStuff(List<String> L, int from, int to){  //2 inclusive, 5 exclusive
		L.subList(from,to).clear();
		System.out.println("remove 2 to 5");
		printMe(L);
	}
		
		
	
	//reverseMe method
	private static void reverseMe(List<String> L){
		ListIterator<String> it = L.listIterator(L.size());
		while(it.hasPrevious())
			System.out.println(it.previous());
	}
	
}