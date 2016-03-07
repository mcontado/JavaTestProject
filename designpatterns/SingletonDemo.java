package designpatterns;

public class SingletonDemo {
	public static void main(String[] args) {
		//Compile time error: The constructor Singleton() is not visible
		//Singleton s = new Singleton();
		
		//Get only available object
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();
		
	/*	ClassicSingleton tmp = ClassicSingleton.getInstance();
		tmp.getInstance();*/
	}
}
