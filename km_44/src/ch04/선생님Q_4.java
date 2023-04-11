package ch04;

public class 선생님Q_4 {

	public static void main(String[] args) {
		// 중간과정은 러프하게 만들어간다
		
		int n =3;
		
		for(int i = 1; i<=7; i+=2) {
			
			// 공백을 출력
			for (int k = n--; k>0; k--) {
				System.out.print(" ");
				
			}
			//*출력 반복문
			for(int j = 0; j<i; j++ ) {
				System.out.print("*");	
			}
			
		System.out.println();	
		
		}
		
		for(int i = 1; i<=5; i +=2) {
			
			// 공백을 출력
			for (int k = n++; k > 0; k--) {
				System.out.print(" ");
				
			}
			//*출력 반복문
			for(int j = n; j > 0; j -=2 ) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
}

