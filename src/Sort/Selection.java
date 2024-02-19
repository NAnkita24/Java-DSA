package Sort;

import array.Printa;

public class Selection{
	public static void main(String[] args) {
		int arr[]= {6,3,5,4,9,10,1};
		+
		for (int i= 0; i < arr.length; i++) {
			int index = i;
			int min = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<min) {
					min = arr[j];
					index =j;
				}
			}
			int	temp = arr[i];
			arr[i]=min;
			arr[index]=temp;
			Printa.print(arr);
		}
	}
}
