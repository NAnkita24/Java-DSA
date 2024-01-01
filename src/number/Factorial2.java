package number;

public class Factorial2 {
	public static void main(String[] args) {
		Factorial2 f1=new Factorial2();
		int res = f1.show(6);
		System.out.println(res);
	}

	int show(int num) {

		int fact=1;
		for (int i = 1; i<=num; i++) {
			fact=fact * i;
		}
		
		return fact;
	}
}
