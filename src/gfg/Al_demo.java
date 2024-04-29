package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class Al_demo {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			al.add(sc.nextInt());
		}		
		System.out.println(al);
		
		int arr[]=new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			arr[i]=al.get(i);
		}
		Printa.print(arr);
	}
}
