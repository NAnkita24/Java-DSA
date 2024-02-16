package array;

public class Rotate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int k=3;


		reverseArray(arr, 0, n-k-1);
		reverseArray(arr, n-k, n-1);
		reverseArray(arr, 0, n-1);

		Printa.print(arr);
	}

	static void reverseArray(int arr[],int i,int j) {
		int temp=0;

		while (i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}

	}
}
