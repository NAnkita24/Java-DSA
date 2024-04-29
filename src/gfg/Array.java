package gfg;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();

		int arr[]=new int [n];
		
		for (int i = 0; i <n; i++) {
			System.out.println("enter value:");
			arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println
			(arr[i]);
		}
		
		

	}
}
