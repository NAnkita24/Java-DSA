package gfg;

public class PeakElement {
	public static void main(String[] args) {
		int arr[]= {10,15,13,11,18,12,13};
		int i=1;

		while (i<arr.length-1) {
			if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.println(arr[i]);
			}
			i++;
		}

	}
}
