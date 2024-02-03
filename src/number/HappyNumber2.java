package number;

public class HappyNumber2 {

	static	int findHappy(int num) {
		int rev=0;
		while (num>0) {
			int rem=num%10;
			 rev=rev+rem*rem;
			 num=num/10;
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		int num=36;
		int a=num;
		
		while (a!=1 && a!=4) {
			 a=findHappy(a);
		}
		
		System.out.println(a);
	}
}
