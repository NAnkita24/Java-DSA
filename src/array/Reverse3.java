package array;

public class Reverse3 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	
	int j=arr.length-1;
	int temp;
	
	for(int i=0;i<arr.length-1;i++) {
		if (i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
	}
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]);
	}
}
}
