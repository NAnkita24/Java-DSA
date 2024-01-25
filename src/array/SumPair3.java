package array;

public class SumPair3 {

	public static void main(String[] args) {

		int arr[]= {30,10,15,5,25,7,20,3};

		int sum=30;
		int count=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k =j+1; k < arr.length; k++) {
					if (sum==arr[i]+arr[j]+arr[k]) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}