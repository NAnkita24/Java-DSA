package array;

public class Sum {
public static void main(String[] args) {
	int arr[]= {12,11,13,43,65,78,5,41,42,44};
	int sum=55;
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (sum==arr[i]+arr[j]) {
				System.out.println(arr[i]+" "+arr[j]);
				count++;
			}
		}
	}
	System.out.println(count);
}
}
