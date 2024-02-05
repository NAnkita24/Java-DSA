package LC;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7};
        int arr2[] = {2, 3, 6, 9 , 11};

        int arr3[] = new int[arr1.length + arr2.length];
        int j = 0;
        int i = 0;

        for (int k = 0; k < arr3.length; k++) {
            if (i < arr1.length && arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
        }

        // Print the merged array
        Printa.print(arr3);
    }
}
