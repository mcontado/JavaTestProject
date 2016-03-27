package practicestatic;

public  class OuterClass {
	private int id = 1;
	private String name = "First Name";

	
	class InnerClass {
		void message() {
			System.out.println("data is " + id + " and name: " + name);
		}
		
	}
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.message();

	}

}
