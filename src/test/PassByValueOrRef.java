package test;

class Test {
	int x;

	Test(int i) {
		x = i;
	}

	Test() {
		x = 0;
	}
}

public class PassByValueOrRef {

	public static void main(String[] args) {
		// Test t = new Test(5);
		//
		// // Reference is passed and a copy of reference
		// // is created in change()
		// change(t);
		//
		// // Old value of t.x is printed
		// System.out.println(t.x);

//		Integer i = new Integer(10);
//		Integer j = new Integer(20);
		int i = 10;
		int j = 20;
		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);

	}

	public static void change(Test t) {
		// We changed reference to refer some other location
		// now any changes made to reference are not reflected
		// back in main
		// t = new Test();

		t.x = 10;
	}

	public static void swap(int i, int j) {
		//Integer temp = new Integer(i);
		int temp = i;
		i = j;
		j = temp;
	}

}
