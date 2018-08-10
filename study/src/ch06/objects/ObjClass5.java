package ch06.objects;

/*
 * 6
 * 2.4.인스턴스의 생성과 사용
 */
public class ObjClass5 {

	public static void main(String[] args) {
		Tv t; // 라는 것은 무엇인가?
		//System.out.println(t);
		//The local variable t may not have been initialized
		// t라는 힙타입의 변수까지는 선언하였으나, 객체의 주소를 담지 않았으니
		// 주소를 이용하여 초기화 해 주어야 한다.
		// 객체의 초기화란 의미는 new 클래스명(); 을 의미 한다.
		t = new Tv();
		System.out.println(t);
		//주소가 출력된다면 정상 초기화 되었고, 주소를 받아왔음을 의미한다.
		
		System.out.println();
		
		// 인스턴스(객체) 의 생성
		Tv obj1 = new Tv();
		System.out.println("obj1의 힙영역 주소="+obj1);
		// 멤버 변수의 사용
		obj1.channel = 10;
		obj1.channelDn();
		System.out.println("channel = "+obj1.channel);
		obj1.channelUp();
		System.out.println("channel = "+obj1.channel);
		obj1.setColor("red");
		String color1 = obj1.getColor();
		System.out.println("color1 = "+color1);
		
		System.out.println();
		
		// 인스턴스(객체) 의 생성
		Tv obj2 = new Tv();
		System.out.println("obj2의 힙영역 주소="+obj2);
		
		// 멤버 변수의 사용
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