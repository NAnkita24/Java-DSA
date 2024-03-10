package LC;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,2,1};
		int [] arr2 = {2,2};
		
		function(arr1,arr2);
	}

	private static void function(int[] arr1,int[] arr2) {
		HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			hm.put(arr1[i], hm.getOrDefault(arr1[i],0)+1);
		}
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		
		for (int i = 0; i < arr2.length; i++) {
			if (hm.containsKey(arr2[i])) {
				al.add(arr2[i]);
				hm.remove(arr2[i]);
			}
		}
		
		int res[]=new int [al.size()];
		System.out.println(al);
		
		for (int i = 0; i < res.length; i++) {
			res[i]=al.get(i);
		}
		
		Printa.print(res);
		
	}
	
}
