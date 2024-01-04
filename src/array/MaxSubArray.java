package array;

public class MaxSubArray {
	public static void main(String[] args) {

		int arr[]= {3,5,-9,4,4,-8,3,1};

		int sum=0;
		int maxsum=0;
		int end = 0;
		int start = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum=sum+arr[j];

				if (maxsum < sum) {
					maxsum=sum ;
					end = j;
				}

				if (sum<0) {
					sum=0;
				}

			}
		}
		System.out.println("maxsum : "+maxsum+" is prsent from index "+start+" to "+end);

	}
}
