package ch07.extend;

/*
 * 7.5 다형성(polymorphism)
 * 진행중~
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
		// 이하 CaptionTv 객체 전용 멤버
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
