package Sort;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {11,3,7,6,17};

		for (int i = 1; i < arr.length; i++) {
			int j=i;
			int	temp=arr[i];
			while (j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;


		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
