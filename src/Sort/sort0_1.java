package Sort;

import array.Array;
import array.Printa;

public class sort0_1 {
public static void main(String[] args) {
	int arr[]= {0,1,1,0,1,0,0,1,0};
	int i=0;
	int j=arr.length-1;
	
	while (i<j) {
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
			i++;
			j--;
		}
	}
	
	Printa.print(arr);
}
}
