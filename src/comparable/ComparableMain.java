package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableMain {

	public static void main(String[] args) {
		Country c1 = new Country (5, "Philippines");
		Country c2 = new Country (4, "Singapore");
		Country c3 = new Country (3, "Korea");
		Country c4 = new Country (2, "Japan");
		Country c5 = new Country (1, "USA");
		
		List<Country> listCountry = new ArrayList<Country>();
		listCountry.add(c1);
		listCountry.add(c2);
		listCountry.add(c3);
		listCountry.add(c4);
		listCountry.add(c5);
		
		System.out.println("Before sort");
		
		for (Country c: listCountry) {
			System.out.println(c.getCountryId() + "|| " + c.getCountryName());
		}

		/*
		 * If any class implements comparable inteface then collection of that object can be 
		 * sorted automatically using Collection.sort() 
		 * or Arrays.sort().Object will be sort on the basis of compareTo method in that class.
		 * */
		
		Collections.sort(listCountry);
		
		System.out.println("\nAfter sort");
		
		for (Country c: listCountry) {
			System.out.println(c.getCountryId() + "|| " + c.getCountryName());
		}


	}

}
