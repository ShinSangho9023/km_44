package ch04;

public class ������Q_4 {

	public static void main(String[] args) {
		// �߰������� �����ϰ� ������
		
		int n =3;
		
		for(int i = 1; i<=7; i+=2) {
			
			// ������ ���
			for (int k = n--; k>0; k--) {
				System.out.print(" ");
				
			}
			//*��� �ݺ���
			for(int j = 0; j<i; j++ ) {
				System.out.print("*");	
			}
			
		System.out.println();	
		
		}
		
		for(int i = 1; i<=5; i +=2) {
			
			// ������ ���
			for (int k = n++; k > 0; k--) {
				System.out.print(" ");
				
			}
			//*��� �ݺ���
			for(int j = n; j > 0; j -=2 ) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
}

