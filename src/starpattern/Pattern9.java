package starpattern;

import java.util.Iterator;

public class Pattern9 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 4; j>=i; j--) {
			System.out.print("  ");
		}
		
		for (int j = 1; j <=i; j++) {
			if (j==i) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
