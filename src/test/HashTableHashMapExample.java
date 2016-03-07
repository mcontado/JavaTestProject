package test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableHashMapExample {
	public static void main(String[] args) {
		  Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
	        hashtableobj.put("Everything", "awesome");
	        hashtableobj.put("Love", "yourself");
	        System.out.println("Hashtable object output :"+ hashtableobj);
	 
	         
	 
	        HashMap hashmapobj = new HashMap();
	        hashmapobj.put("Everything", "awesome");  
	        hashmapobj.put("Love", "yourself"); 
	        System.out.println("HashMap object output :"+hashmapobj);    
	}
}
