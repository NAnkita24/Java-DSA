package Sort;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]={12,5,32,87,44};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j <arr.length; j++) {
			if (arr[j]<arr[i]) {
			int	temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
