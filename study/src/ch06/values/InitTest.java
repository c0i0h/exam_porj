package ch06.values;

/*
 * 6.1 ������ �ʱ�ȭ
 * 6.2 ����� �ʱ�ȭ
 */
public class InitTest {
	// ���� ���� ����, ��ü�� �����ɶ� ���� ���� ����Ǵ� �κ�(Ŭ���� ����, Ŭ���� �ʱ�ȭ ����, ����ƽ �Լ�, �ν��Ͻ� �ʱ�ȭ ��, ������ ��)
	// �Ͻ��� �ʱ�ȭ, int �� ������ �Ͻ������� 0 ���� �ʱ�ȭ ��
	int num;
	
	// �Ͻ��� �ʱ�ȭ, char �� ������ �Ͻ������� '\u0000' ���鹮�ڷ� �ʱ�ȭ ��
	char ch; // \u0000 �� �Ͻ������� �ʱ�ȭ
	//char ch2 = null; // null �� �ʱ�ȭ �Ҽ� ����
	//char ch3 = ''; // '' ���� �ʱ�ȭ �� �� ����, '' �� �ƴ� '\u0000' ���� �ʱ�ȭ �Ǿ�� ��.
	
	// �Ͻ��� �ʱ�ȭ, String �� ������ �Ͻ������� null �� �ʱ�ȭ ��
	static String data;
	
	static int count = 0;
	int cnt = 0;
	
	int serialNo;
	String color;
	String gearType;
	
	// �Ͻ��� �ʱ�ȭ, String[] �� ������ �Ͻ������� null ä���� �迭������ �ʱ�ȭ ��.
	// str�� String��ü�� �ּҰ� ����.
	String[] str = new String[5];
	String[] str2 = {"", "", "", "", ""}; // ������ʱ�ȭ, ����)null �� "" �ٸ���.
	String[] str3 = {null, null, null, null, null}; // ������ʱ�ȭ
	
	// ���, �ٲܼ� ���� ����, ���� �ѹ��� �ʱ�ȭ ����
	//final int ST_NO;		// �Ͻ��� �ʱ�ȭ�Ϸ� ������ ������ ������ ������ ����� ���� �߻�
	final int ST_NUM = 100;	// ����� �ʱ�ȭ
		

	public static void main(String[] args) {
		//new InitTest();
	}

}
