package hackerrank;

public class VMWare_MaxDiffArray {
	static int maxDifference(int[] a) {
		
		int maxdiff = a[1] - a[0];
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[j] - a[i] > maxdiff) {
					maxdiff = a[j] - a[i];
				}
			}
		}
		return maxdiff;
	}
	public static void main(String[] args) {
		int[] a = {2,3,10,2,4,8,1};
		System.out.println(maxDifference(a));

	}

}
