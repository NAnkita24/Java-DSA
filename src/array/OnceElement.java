package array;

public class OnceElement {
public static void main(String[] args) {
	int arr[]= {34,67,45,81,76,45,34,81};
	
	for (int i = 0; i < arr.length; i++) {
		int count=0;
		for (int j =0; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				count++;
			}
		}
		if (count==1) {
			System.out.println(arr[i]);
		}
	}
	
}
}
