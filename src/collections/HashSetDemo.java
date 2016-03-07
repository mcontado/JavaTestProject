package collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(10);
		h.add(null);
		h.add("S");
		h.add("Z");
		
		System.out.println(h.add(10));
		System.out.println(h);
	}

}
