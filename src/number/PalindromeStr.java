package number;

public class PalindromeStr {
	static String str ="madam";

	public static void main(String[] args) {
		String rev = revString(str);

		boolean res = checkPal(rev);
		System.out.println(res);

		if (res) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not Palindrome");
		}
	}

	static String revString(String str2) {
		int a=str.length();
		String rev="";
		for (int i =a-1; i >=0; i--) {
			rev =rev +  str.charAt(i);
		}
		return rev;
	}

	static boolean checkPal(String rev) {
		boolean flag = true;
		System.out.println(str+" "+rev);
		if (str.equals(rev)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
