package gfg;

public class Bubble {
public static void main(String[] args) {
	int arr[] = {1, 5, 3, 2};
	int n=arr.length;
	asc(arr, n);
}
public static void asc(int arr[],int n) {
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	Printa.print(arr);
}
}
