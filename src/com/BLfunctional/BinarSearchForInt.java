
public class BinarSearchForInt {
	  public static void main(String args[]){      
		    System.out.println("Enter the Decimal value");
		    java.util.Scanner sc= new java.util.Scanner(System.in);
		    int value = sc.nextInt();
//		    toBinary(value);
		    
		    String str=Utility.binarySearchForInt(value);
			}

}
