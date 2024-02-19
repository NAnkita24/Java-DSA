package Recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial1(5));
	}
   static int factorial1( int n){
	   int fact=1;
		if (n==1) {
			return 1;
		}
		
		fact=n*factorial1(n-1);
		return fact;
	}
}
