package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList <Data> list = new ArrayList <Data>();
		
		Data d = null;
		
		d = new Data();
		d.setNum(1);
		d.setName("�����");
		list.add(d);
		
		d = new Data();
		d.setNum(2);
		d.setName("Ű����");
		list.add(d);
		
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		
		Data input = new Data();
		input.setName(sc.next());
		input.setNum(sc.nextInt());
		
		// �Է��� ���� ����Ʈ�� �ִ��� ��ġ ���
		
		// �˻��� �Ϸ��� equals�� �������̵� �ؼ� �޼��带 ����� ���� �Ѵ�.
		// object���� ��ӹ��� equals�� �������̵�
		
		
		int i = list.indexOf(input);
		
		if (i == -1) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println(i + "������ �ֽ��ϴ�.");
		}
	}
}

