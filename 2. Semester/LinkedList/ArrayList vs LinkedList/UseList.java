import java.util.*;
import java.io.*;

public class UseList {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("mobydick.txt"));
		
      //Langsom da den skal fjerne index 0 og rykke hele listen en gang til venstre(sekventielt datastruktur)
      //List<String> words = new ArrayList();
		
      //Hurtigere da noderne har deres egen pointer(adresse) i hukommelsen(dynamisk datastruktur) 
      List<String> words = new LinkedList();
      
      //læser fil (se metode)
      readFile(input, words);

		System.out.println("Removing the word...");
		while(!words.isEmpty())
		{
         //fjerner index/node 0
			words.remove(0);
		}
		System.out.println("Done...");
	}

	
	public static void readFile(Scanner input, List<String> words)
	{
		System.out.println("Reading the file...");
		
		while(input.hasNext())
		{
			String word = input.next();
			words.add(word);
		}
	}

   //Bruges til at gøre Array/Linked List hurtigere da Iterator husker sin position under søgningen 
    public static void everyOther(List<String> words)
    {
        for(int i = 0; i < words.size(); i++)
        {
            words.remove(i);
        }

        Iterator<String> itr = words.iterator();
        while(itr.hasNext())
        {
            itr.next();
            if(itr.hasNext())
            {
                itr.remove();
                itr.next();
            }
        }

    }
		
}