package array;

public class Swap1 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};  
	int k=3;
	int n=arr.length;
	int j=0;
	int [] arr1 = new int [n];
	
	for (int i = n-k; i < arr.length; i++) {
		arr1[j]=arr[i];
		j++;
	}
	
	for (int i =0; i <=n-k-1; i++) {
		arr1[j]=arr[i];
		j++;
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr1[i]+" ");
	}
	
	

}
}
