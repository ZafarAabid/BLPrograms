

/**This is program is to illustrate String repalcement using
 * String.replace() method
*/

package com.bridgeLabz.functional;

public class ReplaceString {

	public static void main(String[] args) {
		java.util.Scanner scanner =new java.util.Scanner(System.in);
		String userName= scanner.nextLine();
		String getString=Utility.replaceString(userName);
		System.out.println(getString);
	}

}
