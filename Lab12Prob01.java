/**
 * File: Lab12Prob01.java
 * @author Ben Bearth, Benji Godo
 * Created on: 11/21/2025
 * Modified on: 11/21/2025
 * Description: uses a recursive method to calculate the value of a function
 */

public class Lab12Prob01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(recursiveAbstract(i));
		}
	}

	public static int recursiveAbstract(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 3;
		} else if (n == 2) {
			return 4;
		} else {
			return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}
}
