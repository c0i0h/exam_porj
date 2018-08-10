package ch06.values;

import java.util.Arrays;

/*
 * 작성자 : 조인현
 * 작성일 : 2018.07.04
 * 제   목 : Chapter6 6장 변수의 초기화
 * 범   위 : 전역 변수, 지역 변수, 초기화(명시적, 암시적)  
 */
public class ValueExam {
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
	
	{
		//여기는 초기화 블럭 입니다.
		int instanceNum = 10;
		//System.out.println("(3){} 여기는 초기화 블럭인데 몇 번째 일까요? 인스턴스 초기화 블럭 입니다.");
		//System.out.println("(3){} 여기를 벗어나면 사용할 수 없어요.");
		//count++;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(3){} serialNo="+serialNo);
		System.out.println("(3){} color="+color);
		System.out.println("(3){} gearType"+gearType);*/
	}
	
	static {
		int staticNum = 20;
		
		System.out.println("6.1 변수 초기화-----");
		//System.out.println("6.2 명시 초기화-----");
		//System.out.println("6.2 클레스 초기화-----");
		//System.out.println("6.3 초기화블럭을 이용한 초기화-----");
		//System.out.println("6.3  생성자를 이용한 초기화-----");
		//System.out.println("6.4 실행순서-----");
		//System.out.println("(1)static 여기는 초기화 블럭인데 몇 번째 일까요? 클래스 초기화 블럭이라고도 합니다.");
		count++;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(1)static  serialNo="+serialNo);
		System.out.println("(1)static  color="+color);
		System.out.println("(1)static  gearType"+gearType);*/
	}
	
	ValueExam() {
		//System.out.println("(4)ValueExam() 생성자는 몇 번째 출력 될까요?");
		//System.out.println("instanceNum="+instanceNum); // 인스턴스 초기화 블럭 사용불가
		//System.out.println("staticNum="+staticNum); // 초기화 블럭내의 변수는 지역 변수 입니다.
		//count++;
		//ST_NUM++; // 변경 불가
		System.out.println("(4)ValueExam()생성자 안에서의  상수 ST_NUM 은? "+ST_NUM);
		System.out.println("(4)ValueExam()생성자 안에서의  static count 은? "+count);
		/*System.out.println(num);
		System.out.println(ch);
		System.out.println(data);
		System.out.println(str);	// 주소가 출력됨
		System.out.println(Arrays.toString(str));	// 주소가 가리키는 힙영역의 객체가 가지고 있는 데이터 출력
		System.out.println(Arrays.toString(str2));
		System.out.println(Arrays.toString(str3));*/
		
		// 생성자의 지역 변수
		int num2;		// 암시적 초기화
		int num3 = 10;	// 명시적 초기화
		
		// 지역변수 num2을 초기화하지 않고 num4에 담을 경우 오류
		//int num4 = num2;
		
		//지역 변수는 지역변수가 선언한 영역 내에서만 사용된다.
		//영역을 벗어나면 소멸 된다.
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(4)ValueExam() 생성자  serialNo="+serialNo);
		System.out.println("(4)ValueExam() 생성자  color="+color);
		System.out.println("(4)ValueExam() 생성자  gearType"+gearType);*/
	}
	
	ValueExam(String color, String gearType) {
		cnt++;
		this.serialNo = cnt;
		this.color = color;
		this.gearType = gearType;
		
		/*cnt++;
		this.serialNo = cnt;
		this.color = "White";
		this.gearType = "Auto";
		System.out.println("(4)ValueExam(두개의 매개변수) 생성자  serialNo="+serialNo);
		System.out.println("(4)ValueExam(두개의 매개변수) 생성자  color="+color);
		System.out.println("(4)ValueExam(두개의 매개변수) 생성자  gearType"+gearType);*/
	}
	
	public static void main(String[] args) {
		/*System.out.println("(2)여기는 static void  main 함수 입니다. jvm 이 제일 먼저 실행합니다.");
		System.out.println("(2)단, 클래스의 전역 변수보다 늦게 실행 되지요~");
		System.out.println("(2)단, 전역 변수 선언이 없다면 제일 먼저 static 가 먼저 실행 됩니다.");*/
		new ValueExam();
		
		System.out.println("전역변수 출력 테스트");
		//System.out.println("전역변수 num="+num); // static 함수에서는 static 함수와 변수를 불러올수 있다.
		
		ValueExam v = new ValueExam();
		System.out.println("전역변수 num="+v.num); // 주소로 접근해야 함
		
		System.out.println("전역변수 data="+data); // 전역변수는 new 로 접근하지 않아도 된다.
		/*
		// 클래스의 초기화
		ValueExam v2; // 인스턴스 변수 v2는 null 초기화 됨
		System.out.println("v 의 주소="+v);
		
		//명시적 초기화를 하지 않으면 error
		//System.out.println("v2 의 주소="+v2);
		v2 = null;
		System.out.println("v2 의 주소="+v2); // 주소가 null 이라는 군요?
											// 이유, 아직 객체 생성이 없군요`
		v2 = new ValueExam();
		System.out.println("v2 의 주소(객체생성후)="+v2);*/
		
		/*ValueExam v3 = new ValueExam("Red", "manual");
		ValueExam v4 = new ValueExam("Black", "auto");
		ValueExam v5 = new ValueExam("Wite", "auto");
		
		System.out.println("v3.serialNo="+v3.serialNo);
		System.out.println("v3.color="+v3.color);
		System.out.println("v3.gearType="+v3.gearType);
		
		System.out.println("v4.serialNo="+v4.serialNo);
		System.out.println("v4.color="+v4.color);
		System.out.println("v4.gearType="+v4.gearType);
		
		System.out.println("v5.serialNo="+v5.serialNo);
		System.out.println("v5.color="+v5.color);
		System.out.println("v5.gearType="+v5.gearType);*/
				
	}

}
