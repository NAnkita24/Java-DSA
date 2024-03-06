package array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[]= {2,4,4,7,9,11,15,15,21,39,57,57,88};
		int count=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count ++;
				}
			}
		}

		System.out.println(count);


		int arr1[]=new int[arr.length-count];
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				arr1[j] = arr[i];
				j++;
			}
		}
		arr1[j] = arr[arr.length-1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}


	}
}
