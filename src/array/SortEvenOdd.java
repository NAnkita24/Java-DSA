package array;

public class SortEvenOdd {
public static void main(String[] args) {
	int arr[]= {30,10,2,4,8,15,5,25,7,20,3};
	int i=0;
	int j=arr.length-1;
	
	while (i<j) {
		if (arr[i]%2==0) {
			i++;
		}
		else if (arr[j]%2==1) {
			j--;
		}
		else {
			int	temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");
	}
}
}
