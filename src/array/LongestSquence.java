package array;

import java.util.HashSet;

public class LongestSquence {
	public static void main(String[] args) {
		int maxlength=0;

		int arr[]= {4,7,5,3,2,8,9,12,13,20};
		HashSet<Integer>h1=new HashSet<>();
		int largeNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			h1.add(arr[i]);
		}
		for (int j = 0; j < arr.length; j++) {
			int num=0;
			int count=0;

			if(!h1.contains(arr[j]-1)) {
				num=arr[j];
			}

			while (h1.contains(num)) {
				count++;
				num++;
			}
			int length=count;
			
			if (length>maxlength) {
				maxlength=length;
				largeNum = num-1;
			}
		}
		System.out.println("Sequence Is : ");
		while (h1.contains(largeNum)) {
			System.out.print(largeNum+" ");
			largeNum--;
		}
		System.out.println();
		System.out.println("maxlength :"+maxlength);

	}
}
