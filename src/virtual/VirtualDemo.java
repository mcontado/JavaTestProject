package virtual;

public class VirtualDemo {
	public static void main(String args[]){
		//Salary s = new Salary("Tet", "Dublin", 1, 100,000.00);
		Salary s = new Salary("Tet","Dublin", 1, 10000.00);
		Employee e = new Salary("Paul", "Boston MA", 2, 12000);
		
		System.out.println("Call mailcheck using salary reference " );
		s.mailCheck();
		System.out.println("\n");
		System.out.println("Call mailcheck using Employee reference " );
		e.mailCheck();
	}
}
