package collections;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		/*t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");*/
		//t.add(null);  /Null Pointer Exception
		//t.add(10);  //Class Cast Exception
		
		// ClassCastException
		//StringBuffer cannot be cast to java.lang.Comparable
		/*t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));*/
		
		
		//System.out.println(t);
		System.out.println("A".compareTo("B"));
		System.out.println("Z".compareTo("B"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
		
	}
}
