package array;

public class SubArray {
	public static void main(String[] args) {
		int arr[]= {4,6,8,10,9,18};
		int i=0;
		int j=arr.length-1;
		int prefix=0;
		int suffix=0;

		while (i<j) {
			if (prefix<suffix) {
				prefix=prefix+arr[i];
				i++;
			}
			else if (suffix<prefix) {
				suffix=suffix+arr[j];
				j--;
			}else {
				prefix=prefix+arr[i];
				suffix=suffix+arr[j];
				i++;
				j--;
			}
		}
		if (prefix == suffix) {
			System.out.println("Equal SubArrays");
		}else {
			System.out.println("Unequal SubArrays");
		}
	}
}
