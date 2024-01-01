package number;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int a=scanner.nextInt();
		
		int rev=0;
		while (a!=0) {
		int	rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		System.out.println(rev);


	}
}
