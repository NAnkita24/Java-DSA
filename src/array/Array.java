package array;

public class Array {
	public static void main(String[] args) {
		int arr []= {12,43,33,65,7,23,89,76,55};
		int num=89;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				count++;
			
		}
	}
		if (count==0) {
			System.out.println("number not present");
		} else {
			System.out.println("Number is present");
		}
}
}