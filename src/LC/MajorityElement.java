package LC;

public class MajorityElement {
	public static void main(String[] args) {
		int [] arr = {2,2,1,1,1,2,2};
		majorityElement(arr);
	}
	public static void majorityElement(int[] arr) {
        int majority=arr[0];
		int counter=1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i]==majority) {
				counter++;
			}
			else if (arr[i]!=majority) {
				counter--;
			}

			if (counter==0) {
				majority=arr[i];
                counter = 1;
			}
		}
        System.out.println(majority);
    }
}
