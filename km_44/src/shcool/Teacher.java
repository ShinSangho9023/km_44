package shcool;

public class Teacher extends Person 
{	//변수
	//현재 변수 4개
	private int salary;
	
	// 생성자 -----------------------------------------------------------
	public Teacher() 
	{
		
	}
	public Teacher(String name, String id, String phone, int salary) 
	{
		super(name, id, phone);
		this.salary = salary;
	}
	
	// 겟터 셋터 ----------------------------------------------
	public int getSalary() 
	{
		return salary;
	}
	
	// 함수 -------------------------------------------------
	public void setSalary(int salary) 
	{ 
		//setName("abc"); // 이러면 부모의 private한 변수에도 접근 가능
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() + " 월급: " + salary;
		
	}
	
}//클래스
