package Recursion;

public class DecreasingOrder {
	public static void main(String[] args) {
		increasing(5);
	}
	static void increasing( int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}

		System.out.println(n);
		increasing(n-1);

	}
}
