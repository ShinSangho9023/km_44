package shcool;

public class School 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		Teacher t = new Teacher();
		
		//Person p = new Student();
		//Person p2 = new Teacher();
		// ��Ӱ����� �� ������ ����Ÿ���̸� ������. 
		// ������ ����Ÿ���̸� �ȵȴ�.
		// ����Ÿ���� ������ ����Ÿ���� ������ �� �ִ�.
		Student s2 = new Student("ȫ�浿","990101-111111", "010-1111-1111",100,90,80);
		Teacher t2 = new Teacher("��ö��","880101-111111", "010-2222-2222",100000);
		 
		System.out.println(s2.getKor() + s2.getEng() + s2.getMath());
		System.out.println(s2.getTotal()); //int ������ ������ �����ϴ� �޼ҵ�
		System.out.println(s2.getAverage());
		System.out.println(s2.getGrade()); // 90"A" 80"B" 70"C" 60"D" 50"F"
		
		System.out.println(s2.toString());// �� ��Ʈ���� ȣ���ؼ� ����.
		System.out.println(t2.toString());
		
	}

}
