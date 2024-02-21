package Sort;

import array.Printa;

public class sort_0 {
public static void main(String[] args) {
	int arr[]= {2,3,0,4,0,5,0,6};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
			}
	Printa.print(arr);

}
}
