package number;

public class numRev {
public static void main(String[] args) {
	int number=5555;
	int num=number;
	int rev = 0;
	while (num>0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;

	}
	System.out.println(rev);
	if (rev==number) {
		System.out.println("Number is Same");
	}
	else {
		System.out.println("Number is not same");
	}
		
}
}
	