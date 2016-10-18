package comparable;


/*
Sorting logic
Sorting logic must be in same class whose objects are being sorted. 
Hence this is called natural ordering of objects

Implementation
Class whose objects to be sorted must implement this interface.e.g 
Country class needs to implement Comparable to collection of country object by id

Sorting method
int compareTo(Object o1)
This method compares this object with o1 object and returns a integer.
Its value has  meaning
1. positive – this object is greater than o1
2. zero – this object equals to o1
3. negative – this object is less than o1

Calling method
Collections.sort(List)
Here objects will be sorted on the basis of CompareTo method

Package
Java.lang.Comparable
 

  
 * */
public class Country implements Comparable {
	int countryId;
	String countryName;
	
	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	//If this.cuntryId < country.countryId:then compare method will return -1
	//If this.countryId > country.countryId:then compare method will return 1
	//If this.countryId==country.countryId:then compare method will return 0

//	negative – this object is less than o1
//	zero – this object equals to o1
//	positive – this object is greater than o1

	@Override
	public int compareTo(Object o) {
		Country country = (Country) o;
		
		return (this.countryId < country.countryId) ? - 1 : 
			(this.countryId > country.countryId) ? 1: 0;
		
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
