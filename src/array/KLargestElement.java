package array;

public class KLargestElement {
public static void main(String[] args) {
	int ele = 5;
	
	int arr []= {11,55,33,18,5,61,99,46,80};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if (i == ele-1) {
			break;
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println(ele+"th Largest number is : "+arr[ele-1]);
}
}
