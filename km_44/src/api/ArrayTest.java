package api;

import java.util.Scanner;

public class ArrayTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num[] = new int [3];
		int i = 0;
		
		//������ �ݺ� �Է¹޾� �迭�� �ʱ�ȭ
		while(true) 
		{
			
			if (i == (num.length)) 
			{
				int newnum [] = new int [(num.length * 2)];
				
				for (int q = 0; q < num.length; q++)// �� �Ű� ���.  
				{
					newnum[q] = num[q];
				}
				
				num = newnum;
				
				int out = 0;
				System.out.println("�׸��ϰ� ������ -1 ġ����");
				out = sc.nextInt();
				if (out == -1) break;
			}
			
			System.out.print("���� �Է�: ");
			num[i] = sc.nextInt();
			i++;
		}
		
		for (int r = 0; r < num.length; r++)
		{
			System.out.print(num[r] + " ");
		}
		
	}
}
