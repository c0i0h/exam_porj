package ch07.extend;

/*
 * 7.5 ������(polymorphism)
 * ������~
 */
public class Polymorphism {

	Polymorphism() {
		Tv t = new Tv();
		t.power = true;
		t.channel++;
		t.power();
		t.channelUp();
		t.channeldown();
		
		CaptionTv c = new CaptionTv();
		c.power = true;
		c.channel++;
		c.power();
		c.channelUp();
		c.channeldown();
		// ���� CaptionTv ��ü ���� ���
		c.text = "";
		c.caption();
		
		/*
		 * 5.1 ������  p354
		 */
		Tv tv = new CaptionTv();
		tv.power = true;
		tv.channel++;
		tv.power();
		tv.channelUp();
		tv.channeldown();
		//tv.text = "";		// error, text cannot be resolved or is not a field
		//tv.caption();		// error, caption(), The method caption() is undefined for the type Tv
		
		/*
		 * 5.2 ���� ������ �� ��ȯ  p356
		 * tv �ν��Ͻ� ������ ����Ÿ�� Tv�� �޾ұ⶧����
		 * Tv Ÿ���� ��ü���� ���Ե��� �ʴ� ���� ����Ҽ� ������.
		 * �̷���, �ڼ�Ÿ������ ����ȯ�� �ָ� �ڼհ�ü�� ������ ������� ����Ҽ� �ְ� �ȴ�.
		 */
		CaptionTv t2 = (CaptionTv)tv;
		t2.power = true;
		t2.channel++;
		t2.power();
		t2.channelUp();
		t2.channeldown();
		t2.text = "";
		t2.caption();
		
		/*
		 * �̹� �θ�Ÿ�� Tv���� ����� tv �ν��Ͻ� ������ �ڼ�Ÿ�� CaptionTv ���� ����� t3 �ν��Ͻ������� ������ ����.
		 */
		//CaptionTv t3 = tv; 
		
		
		/*
		 * ���� Ÿ��(��)�� �ν��Ͻ����� ���� Ÿ��(��)�� �ν��Ͻ��� ������ �ִ�.
		 */
		CaptionTv t4 = t2;
		t4.power = true;
		t4.channel++;
		t4.power();
		t4.channelUp();
		t4.channeldown();
		t4.text = "";
		t4.caption();
		
		
		/*
		 * ����Ÿ��(��)�� �ν��Ͻ��� �ڼ�Ÿ��(��)�� �ν��Ͻ��� ���� ��� �ڵ� �� ��ȯ�ɼ� �ִ�.
		 * ������, �ڼ�Ÿ���� ��ü�� ���� ��� ������ ����Ҽ� ���� �ȴ�.
		 */
		Tv t5 = t4;
		t5.power = true;
		t5.channel++;
		t5.power();
		t5.channelUp();
		t5.channeldown();
		//t5.text = "";
		//t5.caption();
		
		/*
		 * 5.3 instanceof �� Ȱ�� p362
		 */
		if(tv instanceof Tv) { System.out.println("tv instanceof Tv"); }
		if(tv instanceof CaptionTv) { System.out.println("tv instanceof CaptionTv"); }
		if(t2 instanceof CaptionTv) { System.out.println("t2 instanceof CaptionTv"); }
		if(t4 instanceof CaptionTv) { System.out.println("t4 instanceof CaptionTv"); }
		if(t4 instanceof Tv) { System.out.println("t4 instanceof Tv"); }
		if(t5 instanceof Tv) { System.out.println("t5 instanceof Tv"); }
		
		
		/*
		 * 5.5 �Ű������� ������ p367
		 * 
		 */
		System.out.println("������ ä��:"+t2.channel);
		t2.buy(tv);
		System.out.println("������ ä��:"+t2.channel);
		
		
		/*
		 * 5.6 ��ü �迭 p370
		 */
		
		Product[] p1 = new Product[3];
		p1[0] = new Computer();
		p1[1] = new Audio();
		p1[2] = new Tablet();
	}
	
	public static void main(String[] args) {
		new Polymorphism();
	}

}

class Tv {
	boolean power;		// ��������(on/off)
	int channel;		// ä��
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channeldown() { --channel; }
}

class CaptionTv extends Tv {
	String text;		// ĸ���� ���� �ֱ� ���� ���ڿ�
	void caption() { /* ��������  */ }
	
	void buy(Tv tv) {
		tv.channelUp();
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product() {}
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}


class Computer extends Product {
	
}

class Audio extends Product {
	
}

class Tablet extends Product {
	
}
