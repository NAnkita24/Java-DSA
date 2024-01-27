package array;

public class Sum2 {
public static void main(String[] args) {
	int arr1[]= {11,12,13,14,15,16,17};
	int arr2[]= {21,22,23,24,25,26,27};
	int[] arr3=new int[arr1.length];
	
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(i==j) {
				arr3[i]=arr1[i]+arr2[j];
			}
		}
	}
	
	for (int i = 0; i < arr3.length; i++) {
		System.out.print(arr3[i]+" ");
	}
}
}
