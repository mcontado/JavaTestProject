package test;

public class WideningPrimitiveConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prints YO155
		 System.out.print("Y" + "O");
	     System.out.print('L' + 'O'); 
	     /*Explanation: When we use double quotes, 
	      * the text is treated as a string and “YO” is printed, 
	      * but when we use single quotes, the characters ‘L’ and ‘O’ 
	      * are converted to int. This is called widening primitive conversion. 
	      * After conversion to integer, the numbers are added ( ‘L’ is 76 and ‘O’ is 79) 
	      * and 155 is printed.
	      * */
	     
	     //prints YOLO
	     System.out.print("Y" + "O");
	     System.out.print('L');
	     System.out.print('O');
	     /*
	      * Explanation: This will now print “YOLO” instead of “YO7679”. 
	      * It is because the widening primitive conversion happens only when ‘+’
	      *  operator is present.
	      * */
	}

}
