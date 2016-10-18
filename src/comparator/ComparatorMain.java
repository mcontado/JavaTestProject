package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Country;

public class ComparatorMain {

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
		
		System.out.println("Before sort by name:");

		for (Country c: listCountry) {
			System.out.println(c.getCountryId() + "|| " + c.getCountryName());
		}
		
		Collections.sort(listCountry, new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				//ascending order
				return (o1.getCountryId() - o2.getCountryId());
			}
		});
		
		System.out.println("\nAfter sort by id in Ascending order:");
		for (Country c: listCountry) {
			System.out.println(c.getCountryId() + "|| " + c.getCountryName());
		}

		//sort by country name
		Collections.sort(listCountry, new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());

			}
			
		});
		
		System.out.println("\nAfter sort by name:");
		for (Country c: listCountry) {
			System.out.println(c.getCountryId() + "|| " + c.getCountryName());
		}


	}

}
