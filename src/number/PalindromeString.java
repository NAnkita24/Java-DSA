package number;import java.util.stream.Stream;

public class PalindromeString {
	static String str ="omkar";
	static int a=str.length();
	static String rev="";
	public static void main(String[] args) {
		for (int i =a-1; i >=0; i--) {
			rev =rev +  str.charAt(i);
		}
		System.out.println(str+" "+rev );
	}
}
