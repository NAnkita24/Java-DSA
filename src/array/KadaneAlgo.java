package array;

public class KadaneAlgo {
public static void main(String[] args) {
	
	int arr[]= {5,4,-4,-9,6,9,-1};
	
	int maxsum=0;
	int cursum=0;
	
	for (int i = 0; i < arr.length; i++) {
		cursum =cursum+arr[i];
		
		if (cursum>maxsum) {
			maxsum=cursum;
		}
		
		if (cursum<0) {
			cursum=0;
			
		}
	}
	System.out.println(maxsum);

}
}
