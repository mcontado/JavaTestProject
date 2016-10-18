package comparator;

import java.util.Comparator;

/*
Sorting logic
Sorting logic is in separate class. 
Hence we can write different sorting based on different attributes of objects to be sorted. 
E.g. Sorting using id,name etc.

Implementation
Class whose objects to be sorted do not need to implement this interface.
Some other class can implement this interface. 
E.g.-CountrySortByIdComparator class can implement Comparator interface to sort 
collection of country object by id


Sorting method
int compare(Object o1,Object o2)
This method compares o1 and o2 objects. and returns a integer.
Its value has meaning.
1. positive – o1 is greater than o2
2. zero – o1 equals to o2
3. negative – o1 is less than o1


Calling method
Collections.sort(List, Comparator)
Here objects will be sorted on the basis of Compare method in Comparator


Package
Java.util.Comparator
 * */

public class CountrySortByIdComparator implements Comparator<Country>{

	//If country1.getCountryId()<country2.getCountryId():then compare method will return -1
	//If country1.getCountryId()>country2.getCountryId():then compare method will return 1
	//If country1.getCountryId()==country2.getCountryId():then compare method will return 0
	//@Override
	public int compare(Country c1, Country c2) {
		return (c1.getCountryId() < c2.getCountryId()) ? -1 :
			(c1.getCountryId() > c2.getCountryId()) ? 1: 0;
	}

	
	
	

}
