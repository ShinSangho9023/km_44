package ch04;

public class Test08 {

	public static void main(String[] args) {
		
		
		int count = 0;
		for (int i =1; i <= 100; i++) {
			if(100 % i == 0) {
				count++;
				System.out.print(i+ " ");
				if(count % 3 == 0) System.out.println();
			}

				}
		}
}