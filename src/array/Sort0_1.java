package array;

public class Sort0_1 {
	public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,0,1,0,1,1,1,0,0};
		int count=0;
		printArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i<count) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
		printArray(arr);
	}
	private static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
