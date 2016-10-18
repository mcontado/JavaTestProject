package test;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

	void bark() {
		System.out.println("dog is barking");
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat(); //animal is eating
		
		Dog d = new Dog();
		d.eat(); //dog is eating
		d.bark(); //dog is barking
		
		Animal c = new Dog();
		c.eat(); //dog is eating
		
		Dog e = (Dog) a;
		 
	}

}
