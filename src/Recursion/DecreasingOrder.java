package Recursion;

public class DecreasingOrder {
	public static void main(String[] args) {
		decreasing(5);


	}
	public static void decreasing(int num) {
		if(num==1) {
			System.out.println("1");
			return;
		}
		System.out.println(num);		
		decreasing(num-1);
	}
}

