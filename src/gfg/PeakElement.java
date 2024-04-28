package gfg;

public class PeakElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(firstpeak(arr, arr.length));
		
	}
	
	
	public static int firstpeak(int arr[], int n) {
		for (int i = 1; i < n-1; i++) {
			if (arr[0]>=arr[1]) {
				return 0;
			}
			
			 else if(arr[i-1]<=arr[i] && arr[i+1]<=arr[i]) {
				return i;
			}
			
		}
		
		if (arr[n-2]<=arr[n-1]) {
			return n-1;
		}
		
		return -1;
	}
}
