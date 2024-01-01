package array;

public class HighestFrequency {
public static void main(String[] args) {
	int arr[]= {32,11,34,34,55,22,34,78,66,22};
	
	for (int i = 0; i < arr.length; i++) {
		int count=0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				count++;
			}
			
		}
		System.out.println("Frequency of element:"+arr[i]+" is "+count);
	}
	
}
}
