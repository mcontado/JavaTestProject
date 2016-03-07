package collections;

import java.util.*;

public class ArrayListCollection {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maria");
		al.add("Teresa");
		al.add("Contado");
		
		al.add(2, "Tet");
		al.add(4, "Del Rio");
		System.out.println(al);

		Iterator ite = al.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
	
		}
	}
	
}
