package array;

public class TwoSum {
public static void main(String[] args) {
	int arr[]= {1,3,-2,2,8,6,-2,3,-3};
	int num=4;
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]+arr[j]==4) {
				System.out.println(arr[i]+" "+arr[j]);
				count++;
			}
		}
	}
	System.out.println(count);
}
}
