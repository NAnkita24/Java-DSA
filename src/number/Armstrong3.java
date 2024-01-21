package number;

public class Armstrong3 {
public static void main(String[] args) {
	
	int number=370;
	int num=number;
	String str=Integer.toString(num);
	int a=str.length();
	int rev = 0;
	while (num>0) {
		int rem=num%10;
		rem=(int) Math.pow(rem, a);
		rev=rev+rem;
		num=num/10;
	}
	System.out.println(rev);
	if (rev==number) {
		System.out.println("Armstrong number");
	} else {
		System.out.println("Not Armstrong number");
	}
	
	
}
}
