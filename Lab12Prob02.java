/**
 * File: Lab12Prob02.java
 * @author Ben Bearth, Benji Godo
 * Created on: 11/21/2025
 * Modified on: 11/21/2025
 * Description: uses a recursive method to reverse a string
 */

public class Lab12Prob02 {

	public static void main(String[] args) {
		System.out.println(reverseString("Taco"));
	}
	
	public static String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			return String.format("%s%s", str.charAt(str.length() - 1), reverseString(str.substring(0, str.length() - 1)));
		}
	}

}
