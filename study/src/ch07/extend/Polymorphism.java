package ch07.extend;

/*
 * 7.5 ������(polymorphism)
 * ������~
 */
public class Polymorphism {

	Polymorphism() {
		Tv t = new Tv();
		
		CaptionTv c = new CaptionTv();
		
		Tv tv = new CaptionTv();
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
