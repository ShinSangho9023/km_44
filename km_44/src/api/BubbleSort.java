package api;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int num [] = {7,3,8,1,4};
		
		int i,j,tmp;
		
		//정렬 전 출력
		for (int d : num) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		// 정렬
		int a = 0; 
		int b = 0;
		int f = 0;
		
//		for(i = 0; i < num.length -1; i++) // 4번만 반복하도록  
//		{
//			b = 0;
//			
//			for (j = 0; j < (num.length - 1) - i; j++) // j가 끝나는 값을 i가 도와준다.
//			{	a++;
//				
//				if (num[j] > num[j+1]) 
//				{ 	b++;
//					tmp = num[j];
//					num[j] = num[j+1];
//					num[j+1] = tmp;
//					f++;
//				}
//			}
//			
//			if (b == 0) 
//			{
//				break;
//			}
//		}
		// 선생님 코드
		int e = 0, t =0;
		for(i = num.length -1; i > 0; i--) 
		{
			boolean flag = true;
			
			for(j = 0; j < i; j++) 
			{ e++;
				if (num[j]>num[j+1]) 
				{ t++;
					flag = false;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;	
				} 
			
			}// 플레그라고 불리는 방법으로 변화를 체크한다.
			
			if (flag) break;
		}
		
		// 정렬 후 출력
		
		for (int c : num) 
		{
			System.out.print(c + " ");
			
		}
		System.out.println();
		System.out.println(a + "비교");
		System.out.println(b + "교환");
		System.out.println(f + "교환");
		System.out.println(e + "교환");
		System.out.println(t + "비교");
	}
}
