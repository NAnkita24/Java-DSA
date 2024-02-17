package array;

import javax.xml.transform.Templates;

public class BinaryArray {
public static void main(String[] args) {
	int arr []= {11,55,33,18,5,61,99,46,80};
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1 ;j < arr.length; j++) {
			if (arr[i]>arr[j]) {
				int temp=arr[i] ;
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}	
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	int num = 33;
	int low=0;
	int high=arr.length-1;
	int mid=(low + high)/2;
	
	System.out.println("Low : "+low);
	System.out.println("High : "+high);
	System.out.println("mid : "+mid);
	System.out.println("num : "+num);

	while (low<=high) {
		if (num==arr[mid]) {
			System.out.println("num is present at index "+mid);
			break;
		}
		else if (num>arr[mid]) {
			low=mid+1;
		}
		else if (num<arr[mid]) {
			high=mid-1;
		}
		mid=(low+high)/2;
		
	}
}
}
