package threads;

public class TestTableSynchronization {
	public static void main(String args[]) {
		TableSynchronization obj = new TableSynchronization();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
