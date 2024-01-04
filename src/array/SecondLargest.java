package array;

public class SecondLargest {
	public static void main(String[] args) {
		int arr []= {12,34,56,78,65,73};

		int large=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>large) {
				large=arr[i];
			}
			else if (arr[i]>second) {
				second=arr[i];

			}
		}
		System.out.println("Largest "+large);
		System.out.println("Second Largest "+second);


	}
}
