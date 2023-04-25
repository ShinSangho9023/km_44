package api;

public class RandomTest {

	public static void main(String[] args) 
	{
		int num [] = new int[6];
		
		int w = 0;
		
		for (int i = 0; i < num.length; i++) 
		{
			num[i] = (int) (Math.random() * 10) + 1;
			
			for (int j = 0; j < i; j++) 
			{
				if (num[i] == num[j]) 
				{
					num[i] = (int) (Math.random() * 45) + 1;
					w++;
					i--;
				}
			}
		}
		
		
		
		System.out.print("[ ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i != num.length -1) {
			System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int a = 0;
		int b = 0;
		// 정렬
		
		for (int i = 0; i < num.length -1; i++) 
		{
			for (int j = i + 1; j < num.length; j++ ) 
			{   a++;
				if (num[i] > num[j]) 
				{	b++;
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
			}
		}
		
		System.out.print("[ ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i != num.length -1) {
			System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.println("비교:" + a + " 교환:" + b);
		System.out.println(w);
	}
}
// 1~45 임의의 정수를 배열에 저장 중복 불가
// 숫자 6개 출력