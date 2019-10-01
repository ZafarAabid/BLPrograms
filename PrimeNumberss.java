import java.util.Scanner;
public class PrimeNumberss {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] argas)
	{
		
		System.out.println("Enter the Range for Prime Number");
		 int r = sc.nextInt();
		System.out.println(" Prime Number from 1 to upto "+r+" is");
		int count=0;
		int num=1;
		boolean prime = false;
		while(count<=r)
		{
			prime=true;
			num++;
		
		for(int i=0;i<num/2;i++) {
			if(i%2==0) {
			prime=false;
			break;
			}}
		
		if(prime)
		{
			count++;
			System.out.print(" "+num);
		}
		
		}
	}
}
