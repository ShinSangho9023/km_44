package shcool;

public class Student extends Person 
{
	// ����
	private int kor;
	private int eng;
	private int math;
	// ���� ��ӹ��� ���� 3�� �� 6�� ������ ����.
	
	
	
	
	//������ -------------------------------------------
	public Student( ) 
	{
		super();
	}// �⺻������
	
	public Student(String name, String id, String phone, int kor, int eng, int math) 
	{
		super(name, id, phone); //��ӹ��� ������ �̶� ä���� ���� ��ü ������ ��ӹ��� �Ŷ� private ���� ����.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//setName(name);
	}// ���� �ʱ�ȭ ������
	
	// ���� ���� ------------------------------------
	public int getKor() 
	{
		return kor;
	}
	public void setKor(int kor) 
	{ 
		
		this.kor = kor;
	}
	
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		this.eng = eng;
	}
	
	public int getMath() 
	{
		return math;
	}
	public void setMath(int math) 
	{
		this.math = math;
	}
	
	// �޼��� --------------------------------------------------
	
	public int getTotal () 
	{	
		int getTotal = kor + eng + math;
		return getTotal;
	} // ���� ���ϴ� �޼���
	
	public double getAverage () 
	{	
		double getAvg = getTotal() / 3.0; // ���� Ŭ������ �̷��� ȣ���ؼ� ��밡��.
		return getAvg;
	} // ��� ���ϴ� �޼���
	
	public String getGrade () 
	{
		double avg = getAverage();
		
		if (avg >= 90) 
		{	
			return "A";
		}
		else if (avg >= 80 && avg < 90 ) 
		{
			return "B";
		}
		else if (avg >= 70 && avg < 80 ) 
		{
			return "C";
		}
		else if (avg >= 60 && avg < 70 ) 
		{
			return "D";
		}
		else 
		{
			return "F";
		}
	
		/* String s = null;
		 * switch ((int)(getAverage() / 10)) {
		 * 	case 10
		 * 	case 9 s = "A"; break;
		 * 	default s = "F" }
		 * return s;*/
		
	}// ����� ��ȯ�ϴ� �޼���
	
	@Override // �׻� ���� ��.
	public String toString() {
		return super.toString() + " ����: " + kor + " ����: " + eng + " ����: " + math;
		
	}
	
	
}// Ŭ����
