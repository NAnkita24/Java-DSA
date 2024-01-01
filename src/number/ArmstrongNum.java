package number;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num= 372;
		String s1=Integer.toString(num);
		int n=s1.length();
		
		int rem;
		int res=0;

		for (int i = 0; i <n; i++) {
			
			rem=num%10;
			rem=(int) Math.pow(rem, n);
			res=res+rem;
			num=num/10;
			
		}
		System.out.println(res);
		
	}
}