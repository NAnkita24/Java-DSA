package Sort;

public class MaxAdd {
public static void main(String[] args) {
	int arr[]= {2,5,8,22,15,20,30};
	int i=0;
	int j=arr.length-1;
	int k=0;
	int max = 0;
	int i1=0,j1=0;
	while (i<j) {
		k=arr[i]+arr[j];
		if (k > max) {
			max = k;
			i1=i;
			j1=j;
		}
		i++;
		j--;
	}
	System.out.println(max+" "+i1+" "+j1);
}
}
