package Sort;

public class Insert2 {
public static void main(String[] args) {
	int arr[]= {34,12,56,44,10,56,8,77};

	for (int i = 1; i < arr.length; i++) {
		
		int temp=arr[i];
		int j=i;
		
		while (j>0 && arr[j-1] > temp) {
			arr[j]=arr[j-1];
			j=j-1;
		}
		arr[j]=temp;
		
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}

}
