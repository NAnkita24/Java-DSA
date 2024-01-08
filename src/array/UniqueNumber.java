package array;

public class UniqueNumber {
	public static void main(String[] args) {
		int arr[]= {10,15,20,15,42,34,56,78,42};
		int i;

		for ( i = 0; i < arr.length; i++) {
			int counter=0;
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					counter++;
				}
				
			}
			if (counter==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
