package LC;

public class Remove_Duplicate2 {
	public static void main(String[] args) {
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

	static public int removeDuplicates(int[] arr) {
		int j=0;
		for(int i=0 ; i<arr.length-2 ; i++){
			if(arr[i]!=arr[i+1]){
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[arr.length-2];
		arr[j++]=arr[arr.length-1];
		return j;
	}
}
