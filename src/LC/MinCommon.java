package LC;

public class MinCommon {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,6};
		int arr2[]= {2,3,4,5};
		int i=0;
		int j=0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				i++;
			}else if (arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				return;
			}
			else if (arr1[i]>arr2[j]) {
				j++;
			}

		}
	}
}
