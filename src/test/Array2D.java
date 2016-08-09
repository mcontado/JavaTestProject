package test;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Array2D {
	
	public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
	}
	
	public static  ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (B > A.size()) {
			for (int i = A.size()-1; i >= 0; i--) {
				
					ret.add(A.get(i));
			
			}
		}
		for (int i = 0; i < A.size()-1; i++) {
			if ((i+B) < A.size()) {
				ret.add(A.get(i + B));
			}
		}
		for (int i=0; i<B; i++) {
			ret.add(A.get(i));
		}
		return ret;
	}
	
	public static void main (String args[]) {
		int[] arr = {19,14,5,14,34,42,63,17,25,39,61,97,55,33,96,62,32,98,77,35};
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(19);
		a.add(14);
		a.add(5);
		a.add(14);
		a.add(34);
		a.add(42);
		a.add(63);
		a.add(17);
		
		
		System.out.println(rotateArray(a, 56));
		
//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		b.add(5);
//		b.add(6);
//		b.add(7);
//		b.add(8);
//		
//		ArrayList<Integer> c = new ArrayList<Integer>();
//		c.add(9);
//		c.add(10);
//		c.add(11);
//		c.add(12);
//		
//		
//		A.add(a);
//		A.add(b);
//		A.add(c);
//		
//		System.out.println(A);
//		
//		ArrayList<ArrayList<Integer>> B = performOps(A);
//		for (int i = 0; i < B.size(); i++) {
//		    for (int j = 0; j < B.get(i).size(); j++) {
//		            System.out.print(B.get(i).get(j) + " ");
//		    }
//		}
	}

}
