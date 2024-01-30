package array;

public class SquareArray {
	public static void main(String[] args) {
		int arr[]= {-10,-3,-2,1,4,5};
		int arr1[]=new int[arr.length];

		for (int i = 0; i < arr1.length; i++) {
			int	a=Math.abs(arr[i]);
			arr[i]=a;
			arr[i]=arr[i]*arr[i];

		}

		for (int k = 0; k < arr1.length; k++) {
			System.out.print(arr[k]+" ");
		}

		System.out.println();

		int i=0;
		int j=arr.length-1;
		int k=arr.length-1;
		while (i<=j) {

			if (arr[i]<arr[j]) {
				arr1[k]=arr[j];
				j--;
				k--;
			}

			else {
				arr1[k]=arr[i];
				i++;
				k--;
			}

		}

		for ( i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}

	}
}
