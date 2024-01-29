package array;

import java.util.HashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	int arr[]= {2,4,4,7,9,11,15,15,21,39,57,57,88};

	HashSet<Integer> h1=new HashSet<Integer>();
	
	for (int i = 0; i < arr.length; i++) {
		h1.add(arr[i]);
	}
	System.out.println(h1);

}
	
}
