package ch07.extend;

/*
 * 7.5 다형성(polymorphism)
 * 진행중~
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
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channeldown() { --channel; }
}

class CaptionTv extends Tv {
	String text;		// 캡션을 보여 주기 위한 문자열
	void caption() { /* 구현사항  */ }
}
