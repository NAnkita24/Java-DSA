package gfg;

public class Merge {
	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};

		merge(nums1, 3, nums2, 3);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int l=nums1.length-1;
		
		while (m!=0 && n!=0) {
			if (nums1[m-1]>=nums2[n-1]) {
				nums1[l]=nums1[m-1];
				l--;
				m--;
			}else {
				nums1[l]=nums2[n-1];
				l--;
				n--;
			}
		}+
		Printa.print(nums1);
	
	
	}

}
