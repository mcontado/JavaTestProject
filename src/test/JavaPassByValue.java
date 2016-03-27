package test;

public class JavaPassByValue {
	// swap() doesn't swap i and j
	   public static void swap(Integer i, Integer j) 
	   {
	      Integer temp = i; //new Integer(i);
	      i = j;
	      j = temp;
	   }
	   public static void main(String[] args) 
	   {
	      Integer i = new Integer(10);
	      Integer j = new Integer(20);
	      swap(i, j);
	      System.out.println("i = " + i + ", j = " + j);
	   }
	   
	   /*Not swapped,
	    * Because we change the reference to 
	    * refer some other object rather than changing member.
	    * Also, Integer is non-mutable (immutable). Since its immutable, 
	    * it cannot change its state once created/constructed.*/
}
