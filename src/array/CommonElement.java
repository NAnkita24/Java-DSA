package array;

public class CommonElement {
public static void main(String[] args) {
	int arr1[]= {11,22,44,33,23,65,87};
	int arr2[]= {12,32,44,56,22,65,88};
	
	for (int i = 0; i < arr1.length-1; i++) {
		for (int j = 0; j < arr2.length-1; j++) {
			if (arr1[i]==arr2[j]) {
				System.out.print(arr2[j]+" ");
			}
		}
	}
}
}
