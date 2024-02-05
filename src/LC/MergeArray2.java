package LC;

public class MergeArray2 {
public static void main(String[] args) {
	 
	int arr1[]= {1,4,5,7,0,0,0,0,0};
	int arr2[]= {2,3,6,9,11};
	int n=4,m=5;
	int i=n-1;
	int j=m-1;
	int k=arr1.length-1;
	
	while (k!=0) {
		if (arr1[i]<arr2[j]) {
			arr1[k]=arr2[j];
			k--;
			j--;
		}
		
		else {
			arr1[k]=arr1[i];
			k--;
			i--;
		}
	}
	
	Printa.print(arr1);
}
}
