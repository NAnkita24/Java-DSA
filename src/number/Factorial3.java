package number;

import java.util.Iterator;

public class Factorial3{
	static int num=5;
	static int fact=1;

	public static void main(String[] args) {
		Factorial3 f =new Factorial3();
		System.out.println(f.show());		
	}
	
	int show(){
		if (num>=1) {
			fact =fact*num;
			num--;
			show();
		}
		return fact;
	}
}