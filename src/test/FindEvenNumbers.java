package test;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class FindEvenNumbers {
	public static void findEven() {
		for (int i = 0; i<=100; i++) {
			if (i%2 == 0) 
				System.out.println(i);
		}
	}
	
	public static void findEven2() {
		for (int i=0; i<=100; i++) {
			if((i/2)*2 == i) {
				System.out.println(i);
			}
		}
	}
	
	public static void findEvenBit() {
		for (int i=0; i<=100; i++) {
			if ((i & 1) == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		findEvenBit();
	}
}
