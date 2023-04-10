package ch04;

public class Test04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 3; j >= i; j--) {
				System.out.print("_");	
			}
			for (int x = 0; x < (i * 2) -1 ; x++) {
				System.out.print("*"); 
			}
			for (int y = 3; y >= i; y--) {
				System.out.print("_");	
			}
			System.out.println();	
		}		
		
		for (int i = 4; i -1 >= 1; i--) {
			
			for (int j = 3; j >= i -1; j--) {
				System.out.print("_");	
			}
			for (int x = 0; x < ((i -1) * 2) -1 ; x++) {
				System.out.print("*"); 
			}
			for (int y = 3; y >= i -1; y--) {
				System.out.print("_");	
			}
			System.out.println();	
		}
	
			
		
	}
}
