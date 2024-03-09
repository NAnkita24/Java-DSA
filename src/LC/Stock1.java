package LC;

public class Stock1 {
	public static void main(String[] args) {
		int arr[]= {7,1,5,3,8,4};
		int min=Integer.MAX_VALUE;
		int i=0;
		int profit=0,maxProfit=0;
		
		while(i<arr.length) {
			if (arr[i]<min) {
				min=arr[i];
			}
			
			profit = arr[i] - min;
			
			if(profit > maxProfit) {
				maxProfit = profit;
			}
			i++;
		}
		System.out.println(maxProfit);
	}
}
