package matrix;

public class Sum {
	public static void main(String[] args) {

		int arr1[][]= {{1,2,3},{4,5,6}};
		int arr2[][]= {{1,2,3},{4,5,6}};

		int arr[][]=new int[arr1.length][arr1[0].length];
		Print.printArray(arr1);
		Print.printArray(arr2);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		Print.printArray(arr);
	}
}
