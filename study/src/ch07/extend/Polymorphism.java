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
		
		/*
		 * 5.1 다형성  p354
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
		 * 5.2 참조 변수의 형 변환  p356
		 * tv 인스턴스 변수는 조상타입 Tv로 받았기때문에
		 * Tv 타입의 객체에서 포함되지 않는 것은 사용할수 없었다.
		 * 이럴때, 자손타입으로 형변환해 주면 자손객체의 나머지 멤버들을 사용할수 있게 된다.
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
		 * 이미 부모타입 Tv으로 선언된 tv 인스턴스 변수는 자손타입 CaptionTv 으로 선언된 t3 인스턴스변수에 담을수 없다.
		 */
		//CaptionTv t3 = tv; 
		
		
		/*
		 * 같은 타입(형)의 인스턴스에는 같은 타입(형)의 인스턴스를 담을수 있다.
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
		 * 조상타입(형)의 인스턴스에 자손타입(형)의 인스턴스를 담을 경우 자동 형 변환될수 있다.
		 * 하지만, 자손타입의 객체의 전용 멤버 변수는 사용할수 없게 된다.
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
		 * 5.3 instanceof 의 활용 p362
		 */
		if(tv instanceof Tv) { System.out.println("tv instanceof Tv"); }
		if(tv instanceof CaptionTv) { System.out.println("tv instanceof CaptionTv"); }
		if(t2 instanceof CaptionTv) { System.out.println("t2 instanceof CaptionTv"); }
		if(t4 instanceof CaptionTv) { System.out.println("t4 instanceof CaptionTv"); }
		if(t4 instanceof Tv) { System.out.println("t4 instanceof Tv"); }
		if(t5 instanceof Tv) { System.out.println("t5 instanceof Tv"); }
		
		
		/*
		 * 5.5 매개변수의 다형성 p367
		 * 
		 */
		System.out.println("변경전 채널:"+t2.channel);
		t2.buy(tv);
		System.out.println("변경후 채널:"+t2.channel);
		
		
		/*
		 * 5.6 객체 배열 p370
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
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channeldown() { --channel; }
}

class CaptionTv extends Tv {
	String text;		// 캡션을 보여 주기 위한 문자열
	void caption() { /* 구현사항  */ }
	
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
