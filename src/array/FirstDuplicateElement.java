package array;

public class FirstDuplicateElement {
public static void main(String[] args) {
	int arr[]= {11,22,33,44,2,66,44,88,66};
	int count=0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				count++;
				break;
			}
		}
		
		if (count>0) {
			System.out.println(arr[i]);
			break;
		}
	}
}
}
