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
		
		Tv tv = new CaptionTv();
		tv.power = true;
		tv.channel++;
		tv.power();
		tv.channelUp();
		tv.channeldown();
		//tv.text = "";		// error, text cannot be resolved or is not a field
		//tv.caption();		// error, caption(), The method caption() is undefined for the type Tv
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
}
