package array;

public class AddArray {

	public static void main(String[] args) {
		int arr2 []= {12,43,33,65,7,23,89,76,55};
		int arr1 []= {12,43,33,65};

		addArray(arr1, arr2);

	}

	public static int[] addArray( int arr1[],int arr2[]) {		
		int max=Integer.max(arr1.length,arr2.length);
		System.out.println(max);
		int [] sum = new int [max];

		if (arr1.length > arr2.length) {
			for (int i = 0; i < sum.length; i++) {
				sum[i]=arr1[i]+(i>arr2.length-1?0:arr2[i]);
			}
		}else {
			for (int i = 0; i < sum.length; i++) {
				sum[i]=arr2[i]+(i>arr1.length-1?0:arr1[i]);
			}
		}
		
		Printa.print(sum);
		return sum;
	}

}
