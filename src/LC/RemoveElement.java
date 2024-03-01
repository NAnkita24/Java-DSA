package LC;

public class RemoveElement {
	public static void main(String[] args) {
		int [] arr = {0,1,2,2,3,0,4,2};
		Printa.print(arr);
		removeElement(arr, 2);
	}
	public static void removeElement(int[] arr, int val) {
        int j = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }

        }
        Printa.print(arr);
    }
}
