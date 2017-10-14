/**
 * 
 */
package lab7;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Ashlyn Thomas
 *
 */
public class NewLab7 
{
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create two linked lists
		LinkedList <String> a = new LinkedList<String>();
		LinkedList <String> b = new LinkedList<String>();
		LinkedList <String> c = new LinkedList<String>();
		
		ListIterator<String> aIter = a.listIterator();
		ListIterator<String> bIter = b.listIterator();
		
		//add elements to first list
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.addLast("Owasso");
		System.out.println("Add elements to first list:\n"+a+"\n");
		
		//add OKC as the second element in the first list
		a.add(1, "OKC");
		System.out.println("Add OKC as second element\n"+a+"\n");
		
		
		//add elements to second list
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		System.out.println("Add elements to second list:\n"+b+"\n");
		


		//merge lists
		int index = 1;
		for(int x = 0; x <= b.size()-1; x++) {
			
			a.add(index, b.get(x));
			index+=2;
		}
		
		System.out.println("Merge lists:\n"+a+"\n");
		
		//My program stops printing here for some reason 
		//so I am not sure if it works correctly 
	
		//remove every second word from first list
		int i = 0;
		/*
		for(;aIter.hasNext();)
		{
			aIter.next();
			if(i%2 != 0 )
				aIter.remove();
			
			i++;
		}
		System.out.println("remove every second word:\n"+a+"\n");
		*/
		//make a deep copy of the second linked list
		for(;bIter.hasNext();)
			c.add(bIter.next());
		
		System.out.println("Deep copy of second list:\n"+c+"\n");
	
		
	}

}