package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection2 {
	
	private static final HashSet Integer = null;

	public static void main(String[] args) {
		int [] arr1 = {4,9,5};
		int [] arr2 = {9,4,9,8,4};
		

		function(arr1,arr2);
	}

	private static void function(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		HashSet<Integer>hs=new HashSet<>();
		int j=0;
		int i=0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]==arr2[j]) {
				hs.add(arr1[i]);
				i++;
				j++;
			}else if (arr1[i]<arr2[j]) {
				i++;
			}
			else if (arr1[i]>arr2[j]) {
				j++;
			}
		}
		System.out.println(hs);
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		for (Integer b : hs) {
			al.add(b);
		}
		System.out.println(al);
		
		int res[]=new int [al.size()];
		
		for (int k = 0; k < res.length; k++) {
			res[k]=al.get(k);
		}
		
		Printa.print(res);
		
	}
	
}
