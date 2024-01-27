package matrix;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row:");
		int r=sc.nextInt();

		System.out.println("Enter number of coloumn:");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];

		System.out.println("Enter a value");
		
		for (int i = 0; i <r; i++) {
			for (int j = 0; j <c; j++) {
				arr[i][j] =sc.nextInt();
			}
		}

		Print.printArray(arr);

	}
}
