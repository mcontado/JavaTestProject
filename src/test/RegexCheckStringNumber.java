package test;
import java.util.regex.Pattern;

public class RegexCheckStringNumber {

	public static boolean containsOnlyDigits(String s) {
		Pattern pattern = Pattern.compile(".*\\D.*"); //checks for non-digit char
		if (!pattern.matcher(s).matches()) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String s = "12345a";
		System.out.println(containsOnlyDigits(s));

	}

}
