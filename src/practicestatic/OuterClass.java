package practicestatic;

public  class OuterClass {
	static int id = 1;
	static String name = "First Name";

	
	static class InnerClass {
		void message() {
			System.out.println("data is " + id + " and name: " + name);
		}
		
	}
	public static void main(String[] args) {
		
		//OuterClass outer = new OuterClass();
		//OuterClass.InnerClass inner = outer.new InnerClass();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.message();

	}

}
