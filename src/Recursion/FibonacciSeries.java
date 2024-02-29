package Recursion;

public class FibonacciSeries {
public static void main(String[] args) {
	fibonacci();
}
public static void fibonacci() {
	int a=0;
	int b=1;
	System.out.print(a+" "+b+" ");
	for (int i = 0; i <10; i++) {
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		
	}
	
	
	
}
}
