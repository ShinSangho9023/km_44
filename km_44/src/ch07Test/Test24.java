package test;

public class Test24 {

	public static void main(String[] args) {
		
		
		char[] a = {'A','I','D','G','U','B','J','S','T','H'};
		
		
		System.out.print("변경전 : ");
		for(int i : a) {
			System.out.print((char)i);
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (65 <= a[i] && a[i] <= 70) {
				
				a[i] = '*';
			}
			
			if (81 <= a[i] && a[i] <= 90) {
				
				a[i] = '*';
			}
		}
		System.out.println();
		System.out.print("변경후 : ");
		for(int i : a) {
			System.out.print((char)i);
		}
	}
}
