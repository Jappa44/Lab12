/**
 * File: Lab12Prob03.java
 * @author Ben Bearth, Benji Godo
 * Created on: 11/21/2025
 * Modified on: 11/21/2025
 * Description: uses a recursive method to reverse a string
 */

public class Lab12Prob03 {

	public static void main(String[] args) {
		System.out.println(reverseString("Taco"));
	}
	
	public static String reverseString(String str) {
		return reverseString(str, str.length() - 1);
	}
	
	public static String reverseString(String str, int index) {
		if (index == 0) {
			return "" + str.charAt(0);
		} else {
			return str.charAt(index) + reverseString(str, index - 1);
		}
	}

}