package Sort;

public class FirstOccurance {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,3,3,4,4,4,4,5,5,6,6};
		
		int s=0;
		int l=arr.length-1;
		int m=(arr.length-1)/2;
		int num=1;
		int f1=0;
		
		while (s<=l) {
			if (num==arr[m]) {
				l=m-1;
				f1=m;
				
			}
			else if (num<arr[m]) {
				l=m-1;
			}
			else if (num>arr[m]) {
				s=m+1;				
			}
			m=(s+l)/2;
			
		}
		System.out.println(f1);
	}
}
