package numberPattern;

public class Number8 {
	public static void main(String[] args) {
		int counter=0;

		for (int i = 1; i <=5; i++) {

			if (i%2==0) {
				int a = counter +3;
				int b = counter + 1;

				for (int j = a; j >=b; j--) {
					System.out.print(j+" ");
					counter++;	
				}
			} else {
				for (int j = 1; j <=3; j++) {
					counter++;
					System.out.print(counter+" ");
				}

			}
			System.out.println();
		}
	}
}
