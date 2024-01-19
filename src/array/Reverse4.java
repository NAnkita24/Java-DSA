package array;

public class Reverse4 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int k=2;
		int n=arr.length;
		reverseArray(arr,0,n-k-1);
		System.out.println();
		reverseArray(arr, n-k,n-1);
		System.out.println();
		reverseArray(arr, 0, n-1);
		
	}

	static void reverseArray(int arr[],int start, int end) {
		int i=start;
		int j=end;
		int temp;

		while (i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);

		}
		
	}

}
