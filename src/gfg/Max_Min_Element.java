package gfg;

public class Max_Min_Element {
public static void main(String[] args) {
int	arr[] = {3, 2, 1, 56, 10000, 167};
System.out.println(element(arr));
}
public static int element(int arr[]) {
	int min=arr[0];
	int max=arr[0];
	for (int i = 1; i < arr.length-1; i++) {
		if (min>arr[i]) {
			min=arr[i];
		}else {
			max=arr[i];
		}
	}
	return max;
	
}
}
