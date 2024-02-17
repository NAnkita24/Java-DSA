package Sort;

import array.Printa;

public class Insertion {
public static void main(String[] args) {
	int arr[]= {6,3,5,4,9,10,1};
	
	for (int i = 1; i < arr.length; i++) {
		int j = i;
		while (j>0 && arr[j]<arr[j-1] ) {
			int temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
			j--;
		}
	}
	Printa.print(arr);
}
}
