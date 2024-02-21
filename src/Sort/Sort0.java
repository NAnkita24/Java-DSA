package Sort;

import array.Printa;

public class Sort0 {
	public static void main(String[] args) {
		int arr[]= {2,5,0,4,8,0,1,15,0};
		int arr1[] = new int[arr.length];
		int j = 0;
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				count++;
			}
			else {
				arr1[j] = arr[i];
				j++;
			}
		}
		
		for (int i = 1; i <=count; i++) {
			arr1[j] = 0;
			j++;
		}
		Printa.print(arr1);
	}
}
