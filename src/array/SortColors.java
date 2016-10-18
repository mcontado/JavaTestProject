package array;

import java.util.ArrayList;

public class SortColors {
	
	public void sortColors(ArrayList<Integer> a) {
		if(a==null||a.size()<2){
	        return;
	    }
	 
	    int[] countArray = new int[3];
	    for(int i=0; i<a.size(); i++){
	        countArray[a.get(i)]++;
	    }
	 
	    int j = 0;
	    int k = 0;
	    while(j<=2){
	        if(countArray[j]!=0){
	            a.set(k++, j);
	            countArray[j] = countArray[j]-1;
	        }else{
	            j++;
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
