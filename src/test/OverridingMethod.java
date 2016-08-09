package test;

class A {
	public void method() {
		System.out.println("A method");
	}
}

class B extends A {
	
	public void method() {
		System.out.println("B method");
	}
}

public class OverridingMethod {

	
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		//A a = new B();
		//a.method();
		//b.method();
	
		//a = b;
		//a.method();
		
		
	}

}
