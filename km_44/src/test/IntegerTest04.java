package test;
//Wrapper Class

public class IntegerTest04 {

	public static void main(String[] args) {
		int i = 100;
		String s = "123";
		
		//int > integer
		Integer in = new Integer(i); //int ���� ���ڸ� �����ؼ� ��ü�� �����Ѵ�.
		
		// String > Integer
		Integer is = new Integer(s); // ��Ʈ���� ��ü�� �����ؼ� ����
		
		//Integer > int 
		int i2 = in.intValue();
		
		// Integer > String 
		String s2 = in.toString();
		
		//int > String 
		String s3 = Integer.toString(i);
		
		//String > int ****************************** �� �ϱ� ************************************
		int i3 = Integer.parseInt(s);
		
		
		String s4 = Integer.toString(i, 7); // �ι�° �Ű������� ���� �ڸ� ������ 7 �����̴�.
		
		int i4 = Integer.parseInt("10", 2); // �ι�° �Ű������� �ְ� ���� �������� �����ش�.
		
		System.out.println(i4);
		
		
		int d = 100;
		// Double , double ��ȯ�� ���� �״�� �貸�� �� �� ����. 
		
		
	}

}
