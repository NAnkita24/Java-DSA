package array;

public class SortSquare {
	public static void main(String[] args) {
		int arr[]= {-15,-11,-9,-5,-1,2,4,8,6,10,12};
		int arr1[]=new int[arr.length];

		int i=0;
		int j=arr.length-1;
		int k=arr.length-1;

		while (i<=j) {
			if (Math.abs(arr[i])>arr[j]) {
				arr1[k]=arr[i]*arr[i];
				i++;
				k--;
			}	
			else {
				arr1[k]=arr[j]*arr[j];
				j--;
				k--;
			}
		}

		for (int j2 = 0; j2 < arr1.length; j2++) {
			System.out.print(arr1[j2]+" ");
		}

	}
}

