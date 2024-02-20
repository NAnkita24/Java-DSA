package Sort;

public class StringSelection {
public static void main(String[] args) {
	String arr[]= {"ankita","omkar","niral","adiraj","saurabh"};

//		int arr[]= {2,4,3,6,8,12,5};

		for (int i = 0; i < arr.length; i++) {
			String min=arr[i];
			int index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j].compareTo(min) < 0 ) {
					min=arr[j];
					index=j;
				}
			}	
			String temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}
}
