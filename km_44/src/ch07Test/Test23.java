package ch07Test;

public class Test23 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		Calculation calc = new Calculation();
		System.out.print("[ ");
		
		for(int i =0; i < a.length; i++) {
			
			if (i == a.length - 1) {
				System.out.print(a[i]+ " ]");
			}
			else {
				System.out.print(a[i]+ ", ");
			}
			
		}
		System.out.println();
		System.out.println("�빀怨� : "+ calc.total(a));
		
		System.out.println("�빀怨� : "+ calc.avg(a));
		System.out.println("理쒕�媛� : "+ calc.max(a));
		System.out.println("理쒖냼媛� : "+ calc.min(a));
		
	}
	


	public static class Calculation {

		public int total(int [] i) {
			
			int sum = 0;
			for (int j =0; j < i.length; j++) {
				sum += i[j];		
			}
			return sum;
		}
		
		public double avg(int [] i) {
			double avg = 0.0;
			int sum = 0;
			sum = total(i);
			
			avg = sum / i.length;
			return avg;
		}
		
		public int max(int [] i) {
			int max = 0;
			max = i[0];
			
			for (int j = 0; j <i.length; j++) {
				if (max < i[j]) {
					max = i[j];
				}
			}
			return max;
		}
		
		public int min(int [] i) {
			int min = 0;
			min = i[0];
			
			for (int j = 0; j <i.length; j++) {
				if (min > i[j]) {
					min = i[j];
				}
			}
			return min;
		}
	}
}
