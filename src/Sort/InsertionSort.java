package Sort;

import array.Printa;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {4,2,1,0,6,5};
		
		for (int i = 0; i < arr.length; i++) {
			int j=i;
			while (j>0) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				j--;
			}
		}
		Printa.print(arr);
	}
}
