package array;

public class InsertElement {
public static void main(String[] args) {
	int arr[]= {32,65,54,98,4,9,17};
	
	int num=25;
	int index=3;
	
	int arr1[]= new int[arr.length+1];
	
	for (int i = 0; i <=index; i++) {
		arr1[i]=arr[i];
		
		if (i==index) {
			arr1[index]=num;
		}
		
	}
	
	for (int i = index+1; i <arr1.length; i++) {
		arr1[i]=arr[i-1];
		
	}
	
	for (int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i]+" ");
	}
}
}
