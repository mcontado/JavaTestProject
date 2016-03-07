
public class StringToInt {

	public static int stringToInt(String str) {
		//String str = "1234" converts to int = 1234
		//String str = "-1234" converts to int = -1234
		
		//Start number at 0, index = 0
		int num = 0, i = 0;
		boolean isNegative = false;
	
		//If the first character is '-'
		if (str.charAt(0) == '-') {
			//Set the negative flag
			isNegative = true;
			//Start scanning with the next character
			i = 1;
		}
				
		//For each character in the string
		while(i < str.length()) {

			//Multiply number by 10
			num *= 10;
			//Add digit character //Minus the ASCII code of '0' to get the value of the charAt(i++)
			num += str.charAt(i++) - '0';
		}
			
		
		//If negative flag set
		if(isNegative)
			num = -num;
		
		//Return number
		return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringToInt("-123456+9"));
	}

}
