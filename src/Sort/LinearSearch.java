package Sort;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {1,4,6,10,11,12};
		int num=11;
		for (int i = 0; i < arr.length; i++) {
			if (num==arr[i]) {
				System.out.println("number is present at index "+i);
				return ;
			}
		}
		System.out.println("Not Present");
	}
}
