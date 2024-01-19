package number;

public class Armstrong2 {
	public static void main(String[] args) {
		int orinum=153;
		int num = orinum;
		String str=Integer.toString(num);
		int a=str.length();

		int rem,rev=0;
		while (num>0) {
			rem=num%10;
			rem=(int) Math.pow(rem, a);
			rev=rev+rem;
			num=num/10;
			System.out.println(rev);
		}
		System.out.println(rev);
		
		if (orinum==rev) {
			System.out.println("Armstrong Number");
		}

		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
