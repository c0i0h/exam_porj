package ch06.objects;

/*
 * 6
 * 2.4.�ν��Ͻ��� ������ ���
 */
public class ObjClass5 {

	public static void main(String[] args) {
		Tv t; // ��� ���� �����ΰ�?
		//System.out.println(t);
		//The local variable t may not have been initialized
		// t��� ��Ÿ���� ���������� �����Ͽ�����, ��ü�� �ּҸ� ���� �ʾ�����
		// �ּҸ� �̿��Ͽ� �ʱ�ȭ �� �־�� �Ѵ�.
		// ��ü�� �ʱ�ȭ�� �ǹ̴� new Ŭ������(); �� �ǹ� �Ѵ�.
		t = new Tv();
		System.out.println(t);
		//�ּҰ� ��µȴٸ� ���� �ʱ�ȭ �Ǿ���, �ּҸ� �޾ƿ����� �ǹ��Ѵ�.
		
		System.out.println();
		
		// �ν��Ͻ�(��ü) �� ����
		Tv obj1 = new Tv();
		System.out.println("obj1�� ������ �ּ�="+obj1);
		// ��� ������ ���
		obj1.channel = 10;
		obj1.channelDn();
		System.out.println("channel = "+obj1.channel);
		obj1.channelUp();
		System.out.println("channel = "+obj1.channel);
		obj1.setColor("red");
		String color1 = obj1.getColor();
		System.out.println("color1 = "+color1);
		
		System.out.println();
		
		// �ν��Ͻ�(��ü) �� ����
		Tv obj2 = new Tv();
		System.out.println("obj2�� ������ �ּ�="+obj2);
		
		// ��� ������ ���
		obj2.channel = 20;
		obj2.channelDn();
		System.out.println("channe1 = "+obj2.channel);
		obj2.channelUp();
		System.out.println("channe1 = "+obj2.channel);
		obj2.setColor("white");
		String color2 = obj2.getColor();
		System.out.println("color1 = "+color2);
	}

}