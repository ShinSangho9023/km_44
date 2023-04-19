package shcool;
// abstract 추상클래스 선언 객체 생성 불가능
public abstract class Person 
{
	//변수
	private String name;
	private String id;
	private String phone;
	// 정보를 제한하기 위해 private을 쓴다. 캡슐화라고도 한다. 
	
	//생성자 --------------------------------------------------
	public Person() 
	{
		
	}// 생성자는 꼭 만들어 두는 습관을 해야
	
	public Person(String name, String id, String phone) 
	{
		this.name = name;
		this.id = id;
		this.phone = phone;
	}// 생성자 처음 만들 때 입력하기 위해서





	// 겟터 셋터를 활용해 여러 기능을 넣을 수 있다. ----------
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	//overriding - 상속받은 메서드를 재정의.
	//리턴 타입 같고, 접근지정자는 같거나 더 개방적, 메서드 이름은 같고, 예외는 같거나 더 하위타입
	//
	
	public String toString() {
		String s = "이름: " + name + "주민등록번호:" + id + "전화번호" + phone;
		return s;
	}
}
