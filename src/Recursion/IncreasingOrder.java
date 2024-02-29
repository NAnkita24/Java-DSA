package Recursion;

public class IncreasingOrder {
	public static void main(String[] args) {
		decreasing(5);


	}
	public static void decreasing(int num) {
		if(num==1) {
			System.out.println("1");
			return;
		}
		decreasing(num-1);
		System.out.println(num);		

	}
}

