package api;

public class Data {
	private int num;
	private String name;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj) 
	{ //���� Ŭ������ �͵��� ������.
		
		if (obj instanceof Data) 
		{
			Data d = (Data) obj; //�ּҰ��� �ٽ� �ٲ� �ִ� ��
			if (this.num == d.num && this.name.equals(d.name)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
}
