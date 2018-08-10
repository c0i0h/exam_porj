package ch06.values;

/*
 * 6.3 �ʱ�ȭ ��
 */
public class BlockTest {
	//(0)�ν��Ͻ� ������ ���� ���� �޸𸮿� �ö󰣴�.
	int count;					// �ν��Ͻ� ������ �� ���� �����ȴ�.
	static int serialNo = 0;	// ���� �ѹ��� �����ǰ�, �޸𸮿� �ѹ��� �ö󰣴�.
	
	// main() �Լ����� ���� ���� �Ǳ� �빮��  ��������������� �ʱ�ȭ�� �̷����
	static {
		System.out.println("(1) - static {} �ʱ�ȭ��(Ŭ���� �ʱ�ȭ ��)");
	}
	
	{
		System.out.println("(3) - {} �ʱ�ȭ��(�ν��Ͻ� �ʱ�ȭ ��)");
	}
	
	BlockTest() {
		System.out.println("(4) - ������() {}");
	}
	public static void main(String[] args) {
		System.out.println("6-3. �ʱ�ȭ ��");
		System.out.println("(2) - static void main, JVM �� ���� ���� ������(��ü�� ���� ��������)");
		new BlockTest();
	}

}
