package ch06.values;

import java.util.Arrays;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.07.04
 * ��   �� : Chapter6 6�� ������ �ʱ�ȭ
 * ��   �� : ���� ����, ���� ����, �ʱ�ȭ(�����, �Ͻ���)  
 */
public class ValueExam {
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
	
	{
		//����� �ʱ�ȭ �� �Դϴ�.
		int instanceNum = 10;
		//System.out.println("(3){} ����� �ʱ�ȭ ���ε� �� ��° �ϱ��? �ν��Ͻ� �ʱ�ȭ �� �Դϴ�.");
		//System.out.println("(3){} ���⸦ ����� ����� �� �����.");
		//count++;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(3){} serialNo="+serialNo);
		System.out.println("(3){} color="+color);
		System.out.println("(3){} gearType"+gearType);*/
	}
	
	static {
		int staticNum = 20;
		
		System.out.println("6.1 ���� �ʱ�ȭ-----");
		//System.out.println("6.2 ��� �ʱ�ȭ-----");
		//System.out.println("6.2 Ŭ���� �ʱ�ȭ-----");
		//System.out.println("6.3 �ʱ�ȭ���� �̿��� �ʱ�ȭ-----");
		//System.out.println("6.3  �����ڸ� �̿��� �ʱ�ȭ-----");
		//System.out.println("6.4 �������-----");
		//System.out.println("(1)static ����� �ʱ�ȭ ���ε� �� ��° �ϱ��? Ŭ���� �ʱ�ȭ ���̶�� �մϴ�.");
		count++;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(1)static  serialNo="+serialNo);
		System.out.println("(1)static  color="+color);
		System.out.println("(1)static  gearType"+gearType);*/
	}
	
	ValueExam() {
		//System.out.println("(4)ValueExam() �����ڴ� �� ��° ��� �ɱ��?");
		//System.out.println("instanceNum="+instanceNum); // �ν��Ͻ� �ʱ�ȭ �� ���Ұ�
		//System.out.println("staticNum="+staticNum); // �ʱ�ȭ ������ ������ ���� ���� �Դϴ�.
		//count++;
		//ST_NUM++; // ���� �Ұ�
		System.out.println("(4)ValueExam()������ �ȿ�����  ��� ST_NUM ��? "+ST_NUM);
		System.out.println("(4)ValueExam()������ �ȿ�����  static count ��? "+count);
		/*System.out.println(num);
		System.out.println(ch);
		System.out.println(data);
		System.out.println(str);	// �ּҰ� ��µ�
		System.out.println(Arrays.toString(str));	// �ּҰ� ����Ű�� �������� ��ü�� ������ �ִ� ������ ���
		System.out.println(Arrays.toString(str2));
		System.out.println(Arrays.toString(str3));*/
		
		// �������� ���� ����
		int num2;		// �Ͻ��� �ʱ�ȭ
		int num3 = 10;	// ����� �ʱ�ȭ
		
		// �������� num2�� �ʱ�ȭ���� �ʰ� num4�� ���� ��� ����
		//int num4 = num2;
		
		//���� ������ ���������� ������ ���� �������� ���ȴ�.
		//������ ����� �Ҹ� �ȴ�.
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(4)ValueExam() ������  serialNo="+serialNo);
		System.out.println("(4)ValueExam() ������  color="+color);
		System.out.println("(4)ValueExam() ������  gearType"+gearType);*/
	}
	
	ValueExam(String color, String gearType) {
		cnt++;
		this.serialNo = cnt;
		this.color = color;
		this.gearType = gearType;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(4)ValueExam(�ΰ��� �Ű�����) ������  serialNo="+serialNo);
		System.out.println("(4)ValueExam(�ΰ��� �Ű�����) ������  color="+color);
		System.out.println("(4)ValueExam(�ΰ��� �Ű�����) ������  gearType"+gearType);*/
	}
	
	public static void main(String[] args) {
		/*System.out.println("(2)����� static void  main �Լ� �Դϴ�. jvm �� ���� ���� �����մϴ�.");
		System.out.println("(2)��, Ŭ������ ���� �������� �ʰ� ���� ������~");
		System.out.println("(2)��, ���� ���� ������ ���ٸ� ���� ���� static �� ���� ���� �˴ϴ�.");*/
		new ValueExam();
		
		System.out.println("�������� ��� �׽�Ʈ");
		//System.out.println("�������� num="+num); // static �Լ������� static �Լ��� ������ �ҷ��ü� �ִ�.
		
		ValueExam v = new ValueExam();
		System.out.println("�������� num="+v.num); // �ּҷ� �����ؾ� ��
		
		System.out.println("�������� data="+data); // ���������� new �� �������� �ʾƵ� �ȴ�.
		/*
		// Ŭ������ �ʱ�ȭ
		ValueExam v2; // �ν��Ͻ� ���� v2�� null �ʱ�ȭ ��
		System.out.println("v �� �ּ�="+v);
		
		//����� �ʱ�ȭ�� ���� ������ error
		//System.out.println("v2 �� �ּ�="+v2);
		v2 = null;
		System.out.println("v2 �� �ּ�="+v2); // �ּҰ� null �̶�� ����?
											// ����, ���� ��ü ������ ������`
		v2 = new ValueExam();
		System.out.println("v2 �� �ּ�(��ü������)="+v2);*/
		
		/*ValueExam v3 = new ValueExam("Red", "manual");
		ValueExam v4 = new ValueExam("Black", "auto");
		ValueExam v5 = new ValueExam("Wite", "auto");
		
		System.out.println("v3.serialNo="+v3.serialNo);
		System.out.println("v3.color="+v3.color);
		System.out.println("v3.gearType="+v3.gearType);
		
		System.out.println("v4.serialNo="+v4.serialNo);
		System.out.println("v4.color="+v4.color);
		System.out.println("v4.gearType="+v4.gearType);
		
		System.out.println("v5.serialNo="+v5.serialNo);
		System.out.println("v5.color="+v5.color);
		System.out.println("v5.gearType="+v5.gearType);*/
				
	}

}
