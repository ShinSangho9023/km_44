package ch04;

public class Test05 {

	public static void main(String[] args) {
		
		
		//1
		for (int i = 0; i <= 9; i++ ) {
			System.out.print(i + " ");
		}
			
		System.out.println();
		//2
		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " ");
			
		}
		System.out.println();
		
		//3
		for (int a = 1; a < 10; a++) {
			
			if (a % 2 != 0) {
				System.out.print(a + " ");
			}
			
		}
		System.out.println();
		//4
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		//5
		for (int i = 10; i <=100; i+=10) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		//6
		for (int i = 5; i >= 1; i--) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		//7
		for (int i = 10000; i >=1; i /= 10 ) {

			System.out.print(i + " ");		
		}
	}
}
