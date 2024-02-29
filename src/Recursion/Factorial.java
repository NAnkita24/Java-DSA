package Recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		
		int smallAns = factorial(n-1);

		int ans=n*smallAns;
		return ans;
	}
}
