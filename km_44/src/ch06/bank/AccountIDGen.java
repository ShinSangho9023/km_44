package ch06.bank;

import java.util.Random;

//���¹�ȣ �ڵ����� Ŭ����
// ����: ����no-����no-�Ϸù�ȣ > xxx-xxxx-xxxx

public class AccountIDGen {
	//�������� ��ü �������ϰ� Ŭ���� �̸����� ȣ�� �����ϰ�
	public static String genAccID(String bankNo, String areaNo) {
		String accID = bankNo+"-"+areaNo+"-";
		Random r = new Random(); //�ڹ� API�� �ִ� Ŭ���� 
		int no = r.nextInt(10000);
		if (no < 10) accID = accID+"000"+no;
		else if (no < 100) accID = accID+"00"+no;
		else if (no < 1000) accID = accID+"0"+no;
		else accID = accID+no;
		
		return accID;
	}
}
