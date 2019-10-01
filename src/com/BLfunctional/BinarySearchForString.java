import java.util.Scanner;
class BinarySearchForString { 
	public static void main(String []args) 
	{ 
		String[] arr = { "Xfr", "Samir", "rohan", "mughda","BridgeLabz"}; 
		System.out.println("Given String is  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("    "+arr[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println(" \nEnter a word to be searched"); 
		String x =sc.next(); 
		int result = Utility.binarySearchForString(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
} 
