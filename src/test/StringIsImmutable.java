package test;

public class StringIsImmutable {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		//s1 = s1 + " new string	";
		//s1 = s1.concat(" new");
		
		//String s3 = new String("abc");
		String s4 = new String("abc");
		
		String a = "abcdef";
		String a1 = a;
		a1 = "test";
		String b = "more stuff";
		a = b;
		System.out.println(a);
		
		System.out.println(a1);
		
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
//		System.out.println(s3.equals(s4));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s3.compareTo(s1));
	}

}
