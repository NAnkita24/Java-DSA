package array;

public class SecondSmallest {
public static void main(String[] args) {
	int arr []= {12,34,56,10,78,65,6,73};

	int small=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i] < small) {
			second = small;
			small=arr[i];															
		}
	}
	System.out.println("small "+small);
	System.out.println("second "+second);
	
}
}
