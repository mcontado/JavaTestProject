package test;

public class ZigZagString {

	public static String convert(String a, int b) {
		final int DOWN = 0;
		final int UP = 1;
		
		if (b == 1) return a;
		
		 
		//Initialize 
	    StringBuilder[] rows = new StringBuilder[b];
	    for (int i = 1; i<=b; i++) {
	    	rows[i-1] = new StringBuilder();
	    }
	   
	    
	    int direction = DOWN;
	    int currentRowNum = 0;
	    
	    for (int charNo = 1; charNo <= a.length(); ) {
	    
	    	if (direction == DOWN) {
	    		currentRowNum++;
	    	} else {
	    		currentRowNum--;
	    	}
	    	
	    	rows[currentRowNum-1].append(a.charAt(charNo-1));
	    	
	    	//meaning we reached the limit of the row, then we go upwards direction
	    	if (currentRowNum == b) { 
	    		direction = UP;
	    	} 

	    	//we reached 
	    	if (currentRowNum == 1) {
	    		direction = DOWN;
	    	}
	    	
	    	charNo++;
	    }
	    
	    
	    StringBuilder output = new StringBuilder();
        for(StringBuilder row : rows)
            output.append(row);
 
        return output.toString();
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABCDE";
		int row = 1;
		System.out.println(convert(a, row));

	}

}
