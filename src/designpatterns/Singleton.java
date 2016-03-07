package designpatterns;

public class Singleton {
	//Early Init
	private static Singleton singleton = new Singleton();
	//Lazy Init
	//private static Singleton singleton;
	
	/*Private constructor prevents any other class from instantiating
	 * */
	private Singleton() {}
	
	/* Static instance method */
	public static Singleton getInstance() {
	//public static synchronized Singleton getInstance() {   --> synchronized
		return singleton;
		/*
		 * Lazy Init
		 * if (singleton == null)
		 * 	singleton = new Singleton();
		 * else
		 *  return singleton;
		 * */
	}
	
	/* Other methods protected by singleton-ness */
	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
	
}


/*
Best optimized code for singleton pattern
public class Singleton {
}
*/