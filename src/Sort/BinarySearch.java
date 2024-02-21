package Sort;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,2,4,6,8,9,10,11,12,15};
	int first=0;	
	System.out.println(first);

	int last=arr.length-1;
	System.out.println(last);

	int mid=(arr.length-1)/2;
	System.out.println(mid);
	
	int num=1;
	
	while (first<=last) {
		if (num == arr[mid]) {
			System.out.println(mid);
			break;
		}else if (num < arr[mid]) {
			last=mid-1;
		}
		else if (num > arr[mid]) {
			first=mid+1;
		}
		mid=(first+last)/2;
		
	}
	
}
}
