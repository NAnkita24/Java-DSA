package array;

public class Reverse {
	public static void main(String[] args) {
		int arr1[]= {12,43,56,67,89,22,35};
		int arr2[]=new int[arr1.length];
		int length=arr1.length;
		int j=0;
		
		for (int i = length-1; i >= 0; i--) {
			arr2[j]=arr1[i];
			j++;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	} 
}
