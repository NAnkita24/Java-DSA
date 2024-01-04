package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {34,12,56,44,66,56,8,77};
		
		for (int i = 0; i <arr.length; i++) {
			int min=i;
			int temp;
			for (int j = i+1; j <arr.length; j++) {
				
				while (arr[min] > arr[j]) {
					min=j;
				}
			}
			temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
