package virtual;


class Animal {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class TestOverriding {
	

	public static void main(String[] args) {
		Animal a = new Animal();  //Animal reference and object
		Animal b = new Dog();  //Animal reference but Dog Object
		a.move();  //runs the method in animal class
	
		/*In compile time, the check is made on reference type - Animal 
		 *In runtime, JVM configures the object type and run the method belongs to that object - which is Dog*/
		b.move();  //runs the method in Dog class
	
		//b.bark(); will result in compile time error since b's reference type animal doesn't have bark method

	}

}
