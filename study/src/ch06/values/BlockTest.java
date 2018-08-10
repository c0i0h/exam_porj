package ch06.values;

/*
 * 6.3 초기화 블럭
 */
public class BlockTest {
	//(0)인스턴스 변수는 제일 먼저 메모리에 올라간다.
	int count;					// 인스턴스 생성할 때 마다 생성된다.
	static int serialNo = 0;	// 최초 한번만 생성되고, 메모리에 한번만 올라간다.
	
	// main() 함수보다 먼저 정의 되기 대문에  멤버변수다음으로 초기화기 이루어짐
	static {
		System.out.println("(1) - static {} 초기화블럭(클래스 초기화 블럭)");
	}
	
	{
		System.out.println("(3) - {} 초기화블럭(인스턴스 초기화 블럭)");
	}
	
	BlockTest() {
		System.out.println("(4) - 생성자() {}");
	}
	public static void main(String[] args) {
		System.out.println("6-3. 초기화 블럭");
		System.out.println("(2) - static void main, JVM 이 가장 먼저 실행함(객체를 먼저 생성한후)");
		new BlockTest();
	}

}
