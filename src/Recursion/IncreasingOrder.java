package Recursion;

public class IncreasingOrder {
	public static void main(String[] args) {
		increasing(5);
	}
	static void increasing( int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}

		increasing(n-1);
		System.out.println(n);


	}
}
