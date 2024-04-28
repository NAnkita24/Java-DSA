package gfg;

public class Rev_Str {
public static void main(String[] args) {
	String str="ankita";
	System.out.println(reverse(str));
}
public static String reverse(String str) {
	String rev="";
	
	for (int i = str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	return rev;

}
}
