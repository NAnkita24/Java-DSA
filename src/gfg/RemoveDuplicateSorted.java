package gfg;

public class RemoveDuplicateSorted {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,6,7,8,8,9};
		int count=0;

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				count ++;
			}
		}
		System.out.println(count);
		int arr1[]=new int [arr.length-count];
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				arr1[j]=arr[i];
				j++;
			}
		}
		Printa.print(arr1);
	}
}
