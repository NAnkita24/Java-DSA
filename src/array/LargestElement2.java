package array;

public class LargestElement2 {
public static void main(String[] args) {
	int arr []= {11,55,33,18,5,61,99,46,80};

	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if (i == 0) {
			break;
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Largest number :"+arr[0]);
}
}
