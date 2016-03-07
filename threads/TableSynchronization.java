package threads;

public class TableSynchronization {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	TableSynchronization t;

	MyThread1(TableSynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	TableSynchronization t;

	MyThread2(TableSynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

/*public class TestSynchronization {
	
}
*/


