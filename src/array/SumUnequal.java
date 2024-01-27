package array;

public class SumUnequal {
public static void main(String[] args) {
	int arr1[]= {11,12,13,14,15,16,17};
	int arr2[]= {21,22,23};
	int length1;
	
	if (arr1.length>arr2.length) {
		length1=arr1.length;
	}
	else {
		length1=arr2.length;
	}
	
	int[] arr3=new int[length1];
	int a=0, b=0;
	for (int i = 0; i < arr1.length; i++) {
		
		for (int j = 0; j <arr2.length; j++) {
			 a=(arr1.length > i) ? arr1[i] : 0;
			 b=(arr2.length > i) ? arr2[j] : 0;
 
			arr3[i]=a+b;
			
		}
	}
	
	for (int i = 0; i < arr3.length; i++) {
		System.out.print(arr3[i]+" ");
	}
}
}
