package array;

public class FrequencyOfElement {
	public static void main(String[] args) {
		int arr[]={11,22,33,44,22,66,44,88,66,22};

		for (int i = 0; i < arr.length; i++) {
			int counter = 1;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					counter++;
				}
			}
			System.out.println("Frequency Of Element "+arr[i]+" is "+counter);
		}
	}
}
