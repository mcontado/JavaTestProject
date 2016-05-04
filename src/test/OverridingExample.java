package test;

class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
}


public class OverridingExample {

	public static void main(String[] args) {
		Dog d = (Dog) new Animal();
		Animal a = (Animal) new Dog();
		Dog d1 = d;
		
//		  Animal a=new Animal();
//		  a.eat();  
//		  
//		  Dog dog = new Dog();
//		  dog.eat();
//		  
//		  Animal an = new Dog();
//		  an.eat();
		
//		  Dog d = (Dog) new Animal();
//		  d.eat();
		  
		  
	}

}
