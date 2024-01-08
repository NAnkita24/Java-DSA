package number;

public class Swap {
public static void main(String[] args) {
	int a,b;
	a=5;
	b=3;
	
//	int temp=a;
//	a=b;
//	System.out.println("a ="+a);
//	System.out.println("b ="+temp);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("b ="+b);
	System.out.println("a ="+a);
}
}
