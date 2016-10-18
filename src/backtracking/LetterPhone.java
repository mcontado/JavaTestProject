package backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterPhone {
	static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
    
	public static  List<String> letterCombinations(String digits) {
        List<String> rst = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return rst;
        }
        char[] letters = new char[digits.length()];
        createLetters(letters, digits, rst, 0);
        return rst;
    }
    public static void createLetters(char[] letters, String digits, List<String> rst, int index) {
        if(index == digits.length()) {
            rst.add(new String(letters));
            return;
        }
        String dict = map[digits.charAt(index) - '0'];
        for(int i = 0; i < dict.length(); i++) {
            letters[index] = dict.charAt(i);
            createLetters(letters, digits, rst, index + 1);
        }
    }
	
	public static void main (String[] args) {
		String digit = "10";
		System.out.println(letterCombinations(digit));
	}
	
	

}
