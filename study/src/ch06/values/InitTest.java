package ch06.values;

/*
 * 6.1 변수의 초기화
 * 6.2 명시적 초기화
 */
public class InitTest {
	// 전역 변수 영역, 객체가 생성될때 제일 먼저 실행되는 부분(클래스 변수, 클레스 초기화 블럭스, 스태틱 함수, 인스턴스 초기화 블럭, 생성자 순)
	// 암시적 초기화, int 형 변수는 암시적으로 0 으로 초기화 됨
	int num;
	
	// 암시적 초기화, char 형 변수는 암시적으로 '\u0000' 공백문자로 초기화 됨
	char ch; // \u0000 로 암시적으로 초기화
	//char ch2 = null; // null 로 초기화 할수 없음
	//char ch3 = ''; // '' 으로 초기화 할 수 없음, '' 이 아닌 '\u0000' 으로 초기화 되어야 함.
	
	// 암시적 초기화, String 형 변수는 암시적으로 null 로 초기화 됨
	static String data;
	
	static int count = 0;
	int cnt = 0;
	
	int serialNo;
	String color;
	String gearType;
	
	// 암시적 초기화, String[] 형 변수는 암시적으로 null 채워진 배열형으로 초기화 됨.
	// str은 String객체의 주소가 담긴다.
	String[] str = new String[5];
	String[] str2 = {"", "", "", "", ""}; // 명시적초기화, 주의)null 과 "" 다르다.
	String[] str3 = {null, null, null, null, null}; // 명시적초기화
	
	// 상수, 바꿀수 없는 변수, 최초 한번만 초기화 가능
	//final int ST_NO;		// 암시적 초기화하려 하지만 컴파일 오류는 없으나 실행시 오류 발생
	final int ST_NUM = 100;	// 명시적 초기화
		

	public static void main(String[] args) {
		//new InitTest();
	}

}
