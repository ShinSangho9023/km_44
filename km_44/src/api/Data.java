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
	{ //하위 클래스는 것들은 못본다.
		
		if (obj instanceof Data) 
		{
			Data d = (Data) obj; //주소값만 다시 바꿔 주는 것
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
