package ch06.objects;

/*
 * 6
 * 2.3.객체의 구성요소 - 속성과 기능
 */
public class ObjClass4 {

	public static void main(String[] args) {
		
		/*
		 * 일단 객체를 생성하고 주소를 받아올 인스턴스 변수를 선언하여 
		 * 생성된 객체의 멤버를 사용할 준비를 한다.
		 */
		Tv obj1 = new Tv();
		
		// 멤버( Tv 에서 선언한 변수, 메서드(함수)
		// 생성자는 클래스의 멤버이긴 하지만 obj1 에서 추적이 안된다. 
		
		// 멤버 변수의 접근 및 사용
		int num1 = obj1.num1;
		String str1 = obj1.str1;
		
		System.out.println("num1="+num1);
		System.out.println("str1="+str1);
		
		// 멤버 함수의 접근 및 사용
		obj1.funcTest();
		
		System.out.println();
		
		// 클래스가 객체 또는 인스턴스로 현실(메모리)세계에 생성되었다면
		// 독립적으로 위의 멤버(변수, 함수) 들을 가지고 있다.
		// 클래스라는 설계도를 복사하여 객체가 생성되면
		// 설계도는 하나지만 설계도를 본뜬 실물이 만들어 지므로
		// 각 객체 또는 인스턴스에서 가지고 있는 멤버들도 독립적으로 존재 하게 된다.
		// 또다른 객체의 접근
		Tv obj2 = new Tv();
		
		// 멤버 변수의 접근 및 사용
		int num2 = obj2.num1;
		String str2 = obj2.str1;
		
		System.out.println("num2="+num2);
		System.out.println("str2="+str2);
		
		// 멤버 함수의 접근 및 사용
		obj2.funcTest();
		
		// 속성 = 어떤 객체가 가지고 있는 값, 상태 를 의미 한다.
		// 속성 = 자바에서는 멤버 변수 라고 한다.
		// 기능 = 어떤 객체가 기지고 있는 기능(함수)를 의미 한다.
		// 기능 = 자바에서는 멤버 함수 라고 한다.
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
	public String str1="텍스트";
	static int count = 0;
	
	private String color;
	boolean power = false; // off
	int channel;
	
	Tv(){
		count++;
		System.out.println(count+" 번째 Tv 객체");
	}
	
	void funcTest() {
		System.out.println(count+" 번째 Tv 객체의 funcTest() 함수 호출!");
	}
	
	void powerOn() {
		power = true;
		System.out.println(count+" 번째 Tv 객체의 메서드는 powerOn()");
		System.out.println(count+" 번째 Tv 객체의 멤버변수는 power이고 결과는="+power);
	}
	void powerOff() {
		power = false;
		System.out.println(count+" 번째 Tv 객체의 메서드는 powerOff()");
		System.out.println(count+" 번째 Tv 객체의 멤버변수는 power이고 결과는="+power);
	}
	void powerToggle() {
		power = !power;
		System.out.println(count+" 번째 Tv 객체의 메서드는 powerToggle()");
		System.out.println(count+" 번째 Tv 객체의 멤버변수는 power이고 결과는="+power);
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