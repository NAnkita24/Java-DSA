package array;


public class MaxSubArray {
	public static void main(String[] args) {

		int arr[]= {3,5,9,-4,4,8,-3,1};

		int sum=0;
		int maxsum=0;
		int start = 0, end = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum=sum+arr[j];

				if (sum>maxsum) {
					maxsum=sum ;
				}

				if (sum<0) {
					sum=0;
					start = i;
					end = j;
				}

			}
		}
		System.out.println("maxsum : "+maxsum+" is prsent from index "+start+" to "+end);
	}
}
