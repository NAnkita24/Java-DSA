package array;

public class Reverse3 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int i=arr.length-1;
	int j=0;
	int temp;
	while (j<i) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i--;
		j++;
	}
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]);
	}
}
}
