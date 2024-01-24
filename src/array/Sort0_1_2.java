package array;

public class Sort0_1_2 {
	public static void main(String[] args) {
		int arr[]= {1,1,0,0,1,0,0,1,1};
		int i = 0;
		int j = arr.length-1;

		while (i<=j) {
			if (arr[i]==0) {
				i++;
			}
			else if (arr[j]==1) {
				j--;
			}
			else {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
		

	}
}

 