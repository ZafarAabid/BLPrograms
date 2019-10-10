package Test;
public class BinarySearch {	
	static int[] arr = new int[]{ 11,22,34,43,55,58,79,81,87 }; 
	static int n=79;
	public static void binarySearch(int low,int mid,int high) {
		if(arr[mid]==n) {
			System.out.println("No. found at "+(mid+1)+ " Position"); return;
		}
		else if(n>arr[mid]) {
			low= mid+1;
			mid=(low+high)/2;
		}
		else {
			high=mid-1;
			mid=(low+high)/2;
		}
		binarySearch(low,mid,high);
	}
	public static void main(String[] args) {
		int low=0,high=8,mid=(low + high)/2;
		binarySearch(low,mid,high);
	}
}