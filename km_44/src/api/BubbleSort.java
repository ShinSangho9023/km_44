package api;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int num [] = {7,3,8,1,4};
		
		int i,j,tmp;
		
		//���� �� ���
		for (int d : num) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		// ����
		int a = 0; 
		int b = 0;
		int f = 0;
		
//		for(i = 0; i < num.length -1; i++) // 4���� �ݺ��ϵ���  
//		{
//			b = 0;
//			
//			for (j = 0; j < (num.length - 1) - i; j++) // j�� ������ ���� i�� �����ش�.
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
		// ������ �ڵ�
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
			
			}// �÷��׶�� �Ҹ��� ������� ��ȭ�� üũ�Ѵ�.
			
			if (flag) break;
		}
		
		// ���� �� ���
		
		for (int c : num) 
		{
			System.out.print(c + " ");
			
		}
		System.out.println();
		System.out.println(a + "��");
		System.out.println(b + "��ȯ");
		System.out.println(f + "��ȯ");
		System.out.println(e + "��ȯ");
		System.out.println(t + "��");
	}
}
