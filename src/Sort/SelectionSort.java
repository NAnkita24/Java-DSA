package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {34,12,54,67,8};
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min]>arr[j]) {
					min=j;
				}
			}
		int	temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
