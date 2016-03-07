package test;

class Parent {
	static void print() {
		System.out.println("Parent print()");
	}
}

class Child extends Parent{
	static void print() {
		System.out.println("Child print()");
	}
}

public class ShadowStaticFunctions {

	
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();

	}

}
