package array;

public class Maxcount {
	public static void main(String[] args) {
		int arr[]= {2,2,1,1,1,2,2};

		int majarity=arr[0];
		int counter=1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i]==majarity) {
				counter++;
			}
			else if (arr[i]!=majarity) {
				counter--;
			}

			if (counter==0) {
				majarity=arr[i];
				counter=1;
			}
		}
		System.out.println(majarity);
	}
}
