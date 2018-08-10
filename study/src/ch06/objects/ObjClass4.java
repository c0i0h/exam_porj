package ch06.objects;

/*
 * 6
 * 2.3.��ü�� ������� - �Ӽ��� ���
 */
public class ObjClass4 {

	public static void main(String[] args) {
		
		/*
		 * �ϴ� ��ü�� �����ϰ� �ּҸ� �޾ƿ� �ν��Ͻ� ������ �����Ͽ� 
		 * ������ ��ü�� ����� ����� �غ� �Ѵ�.
		 */
		Tv obj1 = new Tv();
		
		// ���( Tv ���� ������ ����, �޼���(�Լ�)
		// �����ڴ� Ŭ������ ����̱� ������ obj1 ���� ������ �ȵȴ�. 
		
		// ��� ������ ���� �� ���
		int num1 = obj1.num1;
		String str1 = obj1.str1;
		
		System.out.println("num1="+num1);
		System.out.println("str1="+str1);
		
		// ��� �Լ��� ���� �� ���
		obj1.funcTest();
		
		System.out.println();
		
		// Ŭ������ ��ü �Ǵ� �ν��Ͻ��� ����(�޸�)���迡 �����Ǿ��ٸ�
		// ���������� ���� ���(����, �Լ�) ���� ������ �ִ�.
		// Ŭ������� ���赵�� �����Ͽ� ��ü�� �����Ǹ�
		// ���赵�� �ϳ����� ���赵�� ���� �ǹ��� ����� ���Ƿ�
		// �� ��ü �Ǵ� �ν��Ͻ����� ������ �ִ� ����鵵 ���������� ���� �ϰ� �ȴ�.
		// �Ǵٸ� ��ü�� ����
		Tv obj2 = new Tv();
		
		// ��� ������ ���� �� ���
		int num2 = obj2.num1;
		String str2 = obj2.str1;
		
		System.out.println("num2="+num2);
		System.out.println("str2="+str2);
		
		// ��� �Լ��� ���� �� ���
		obj2.funcTest();
		
		// �Ӽ� = � ��ü�� ������ �ִ� ��, ���� �� �ǹ� �Ѵ�.
		// �Ӽ� = �ڹٿ����� ��� ���� ��� �Ѵ�.
		// ��� = � ��ü�� ������ �ִ� ���(�Լ�)�� �ǹ� �Ѵ�.
		// ��� = �ڹٿ����� ��� �Լ� ��� �Ѵ�.
		/*obj1.powerOn();
		obj1.powerOff();
		obj1.powerToggle();
		obj1.powerToggle();
		System.out.println();
		obj2.powerOn();
		obj2.powerOff();
		obj2.powerToggle();
		obj2.powerToggle();*/
		
		
	}

}

class Tv {
	public int num1=10;
	public String str1="�ؽ�Ʈ";
	static int count = 0;
	
	private String color;
	boolean power = false; // off
	int channel;
	
	Tv(){
		count++;
		System.out.println(count+" ��° Tv ��ü");
	}
	
	void funcTest() {
		System.out.println(count+" ��° Tv ��ü�� funcTest() �Լ� ȣ��!");
	}
	
	void powerOn() {
		power = true;
		System.out.println(count+" ��° Tv ��ü�� �޼���� powerOn()");
		System.out.println(count+" ��° Tv ��ü�� ��������� power�̰� �����="+power);
	}
	void powerOff() {
		power = false;
		System.out.println(count+" ��° Tv ��ü�� �޼���� powerOff()");
		System.out.println(count+" ��° Tv ��ü�� ��������� power�̰� �����="+power);
	}
	void powerToggle() {
		power = !power;
		System.out.println(count+" ��° Tv ��ü�� �޼���� powerToggle()");
		System.out.println(count+" ��° Tv ��ü�� ��������� power�̰� �����="+power);
	}
	void channelUp() {
		channel++;
	}
	void channelDn() {
		channel--;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return this.color;
	}
}