package api;

import java.util.Scanner;

public class ArrayTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num[] = new int [3];
		int i = 0;
		
		//정수를 반복 입력받아 배열을 초기화
		while(true) 
		{
			
			if (i == (num.length)) 
			{
				int newnum [] = new int [(num.length * 2)];
				
				for (int q = 0; q < num.length; q++)// 값 옮겨 담기.  
				{
					newnum[q] = num[q];
				}
				
				num = newnum;
				
				int out = 0;
				System.out.println("그만하고 싶으면 -1 치세요");
				out = sc.nextInt();
				if (out == -1) break;
			}
			
			System.out.print("정수 입력: ");
			num[i] = sc.nextInt();
			i++;
		}
		
		for (int r = 0; r < num.length; r++)
		{
			System.out.print(num[r] + " ");
		}
		
	}
}
