package shcool;
// abstract �߻�Ŭ���� ���� ��ü ���� �Ұ���
public abstract class Person 
{
	//����
	private String name;
	private String id;
	private String phone;
	// ������ �����ϱ� ���� private�� ����. ĸ��ȭ��� �Ѵ�. 
	
	//������ --------------------------------------------------
	public Person() 
	{
		
	}// �����ڴ� �� ����� �δ� ������ �ؾ�
	
	public Person(String name, String id, String phone) 
	{
		this.name = name;
		this.id = id;
		this.phone = phone;
	}// ������ ó�� ���� �� �Է��ϱ� ���ؼ�





	// ���� ���͸� Ȱ���� ���� ����� ���� �� �ִ�. ----------
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
	
	//overriding - ��ӹ��� �޼��带 ������.
	//���� Ÿ�� ����, ���������ڴ� ���ų� �� ������, �޼��� �̸��� ����, ���ܴ� ���ų� �� ����Ÿ��
	//
	
	public String toString() {
		String s = "�̸�: " + name + "�ֹε�Ϲ�ȣ:" + id + "��ȭ��ȣ" + phone;
		return s;
	}
}
