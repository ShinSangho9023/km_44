package test;
import java.util.Random;
public class Test25 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] a = new int[6];
		
		
		for (int i =0; i < a.length; i++) {
			
			a[i] = random.nextInt(46);
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j <a.length; j++) {
				
				if (a[i] == a[j]) {
					
					a[i] = random.nextInt(46);
					j -=1;
				}
			}
		}
		for (int i : a) {
			
			System.out.print(i+ " ");
		}
	}
}

		
			
			
			
		
		
		
	
			
			
			
			
	
		
	

	

