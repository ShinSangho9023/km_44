package shcool;

public class Teacher extends Person 
{	//����
	//���� ���� 4��
	private int salary;
	
	// ������ -----------------------------------------------------------
	public Teacher() 
	{
		
	}
	public Teacher(String name, String id, String phone, int salary) 
	{
		super(name, id, phone);
		this.salary = salary;
	}
	
	// ���� ���� ----------------------------------------------
	public int getSalary() 
	{
		return salary;
	}
	
	// �Լ� -------------------------------------------------
	public void setSalary(int salary) 
	{ 
		//setName("abc"); // �̷��� �θ��� private�� �������� ���� ����
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() + " ����: " + salary;
		
	}
	
}//Ŭ����
