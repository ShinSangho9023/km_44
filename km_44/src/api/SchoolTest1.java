package api;

import java.util.ArrayList;
import java.util.Scanner;

import shcool.Student;

public class SchoolTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>(); // �ϴ� �� �迭�� ����� �� ��.
		
		// �л� ������ �ݺ������� �Է¹޾� ����
		
		while(true) {
			
			Student Student = new Student();
			
			// �л��� �̸�,�й�, ��ȭ��ȣ, ������������ �Է¹޾� Student ��ü Ÿ������ arraylist�� ����
			System.out.print("���� ���� �Է��ϼ���");
			Student.setKor(sc.nextInt());
			System.out.print("���� ���� �Է��ϼ���");
			Student.setEng(sc.nextInt());
			System.out.print("���� ���� �Է��ϼ���");
			Student.setMath(sc.nextInt());
			System.out.print("id �Է��ϼ���");
			Student.setId(sc.next());
			System.out.print("�̸� �Է��ϼ���");
			Student.setName(sc.next());
			System.out.print("��ȭ��ȣ �Է��ϼ���");
			Student.setPhone(sc.next());
			list.add(Student); 
			
			// ����Ʈ�� �� ��ü�� �־��ִ� ��. ���Ⱑ ���ذ� �ȉ�� �ſ���. �迭�� ��ü ������ ������ �ص� ��.
			// �Դٰ� �� �ڷᱸ���� �̸��� �ߺ��Ǿ ������� ������ �̷������� ���� �����ϴ�.
			
			//y �Է��ϸ� ��� n�Է��ϸ� ����
			System.out.println("��� �Է��Ͻðڽ��ϱ�? (y/n)");
			String a = sc.next();
			
			if (a.equalsIgnoreCase(("n"))) 	break;

		}
		
		//��� �л����� ���
		//System.out.println(list);
		
		// �й� �̸� ���� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId()+ " ");
			System.out.print(list.get(i).getName()+ " ");
			System.out.print(list.get(i).getTotal()+ " ");
			System.out.println(list.get(i).getAverage()+ " ");
			// ��Ʈ�� �޼��带 �̾��ش�. 
			//"\t" > ������ �о��ֱ�
			
			
//		for (Student st : list) 
//			{
//			System.out.print(list.get(i).getId()+ " ");
//			System.out.print(list.get(i).getName()+ " ");
//			System.out.print(list.get(i).getTotal()+ " ");
//			System.out.println(list.get(i).getAverage()+ " ");
//			}
			
			//��ü �л��� ��� ����
		}
		
		double avg = 0.0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			avg += list.get(i1).getAverage();
		}
		
//		double avg = 0.0;
//		for (Student st : list) {
//			avg += st.getAverage();
//		}
//		avg /= list.size();
		
		System.out.print("��ü �л� ��� : " + avg / list.size());
		
	}
}




