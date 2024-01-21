package number;

public class HappyNumber {
	public static void main(String[] args) {
		int num=32;
		int result=num;

		while (result!=1 && result !=4) {
			result=isHappyNumber(result);
		}
		System.out.println(result);
	}

	static int isHappyNumber(int result) {
		int a=0;
		while (result>0) {
			int rem=result%10;
			a=a+rem*rem;
			result=result/10;

		}
		return a;

	}
}
