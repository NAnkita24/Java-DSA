package array;

public class Reverse2 {
public static void main(String[] args) {
	int arr[]= {12,54,34,76,89,74,90,66};
	int i=0;
	int j=arr.length-1;
	int temp;
	while (i<j) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");
	}
}
}
