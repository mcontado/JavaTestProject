package collections;
import java.util.*;  

public class LinkedListCollection {
	public static void main (String args[]) {
		LinkedList<String> al= new LinkedList<String>();  
		al.add("test1");
		al.add("test2");
		al.add("test21");
		al.add("test3");
		al.add("test4");
		
		System.out.println(al);
		
		Iterator<String> ite = al.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
}
