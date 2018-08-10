package ch06.values;
/*
 * 6.4 멤버의 초기화 시기와 순서
 */
public class ProductTest {

	public static void main(String[] args) {
		System.out.println("6-4. (1)멤버변수의 초기화");
		//System.out.println("6-4. (2)생성자의 초기화");
		System.out.println("(2) - static void main, JVM 이 가장 먼저 실행함(객체를 먼저 생성한후)");
		new Product();
		/*Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product("Red");
		
		System.out.println("p1의 serialNo="+p1.serialNo);
		
		System.out.println("p2의 serialNo="+p2.serialNo);
		
		System.out.println("p3의 serialNo="+p3.serialNo);
		
		System.out.println("p4의 serialNo="+p4.serialNo);

		System.out.println("count="+Product.count);*/
	}

}

class Product {
	static int count = 0; //(1) 메모리 영역에 최초 한번만 생성하고, 다음번 인스턴스가 생성할때마다 생성되지 않는다.
	int serialNo;		  //(1) 최초 한번 생성한후, 다음번 인스턴스가 생성될때마다 생성됨.
	String color;		  //(1) 최초 한번 생성한후, 다음번 인스턴스가 생성될때마다 생성됨. 
	
	{
		++count;
		serialNo = count;
		System.out.println("(4) - {} 초기화 블럭");
		//여기서 선언된 지역 변수는 다른곳에서는 사용할수 없다.
		//블럭내에서의 지역변수는 블럭내에서만 사용한다.
		//블럭을 벗어나면 사라진다.
	}
	
	//main() 함수보다 늦게 정의 되는 Product 객체이기때문에 main() 함수 이후로 실행되어짐
	static {
		//++count;			// 정상수행
		//serialNo = count;	// error, 일반변수에 static 변수를 담을수 없다.
		System.out.println("(3) - static {} 초기화 블럭");
		//여기서 선언된 지역 변수는 다른곳에서는 사용할수 없다.
		//블럭내에서의 지역변수는 블럭내에서만 사용한다.
		//블럭을 벗어나면 사라진다.
	}
	
	public Product() {
		//++count;			// 정상수행
		//serialNo = count;	// 정상수행
		color = "white";
		System.out.println("(5) - 생성자");
	}
	
	// 구매한 고객마다 색상을 자동으로 설정하고 싶을때 
	public Product(String color) {
		//++count;			// 정상수행
		//serialNo = count;	// 정상수행
		this.color = "white";
		System.out.println("(5) - 생성자(매개변수1개)");
	}
}