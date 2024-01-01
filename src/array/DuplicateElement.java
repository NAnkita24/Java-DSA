package array;

public class DuplicateElement {
public static void main(String[] args) {
	int arr[]={11,22,33,44,22,66,44,88,66};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
}
