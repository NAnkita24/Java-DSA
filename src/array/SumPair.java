package array;

public class SumPair {
public static void main(String[] args) {
	int arr []= {10,18,12 ,28 ,2,50,15,25,35};
	
	int sum=40;
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			for (int k = j+1; k < arr.length; k++) {
				if (arr[i]+arr[j]+arr[k]==40) {
					System.out.println(arr[i]+" , "+arr[j]+" , "+arr[k]);
					count++;
				}
			}
		}
	}
	System.out.println("count "+count);
	
}
}
