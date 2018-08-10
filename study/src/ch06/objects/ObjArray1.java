package ch06.objects;

/*
 * 6
 * 2.5.객체 배열
 */
public class ObjArray1 {

	public static void main(String[] args) {
		/*
		 * 객체 배열
		 * 배열은 같은 타입의 값들을 담기 위한 묶음 공간을 의미한다.
		 * 그런데, 같은 객체라는 타입으로 배열을 만들수 있다.
		 * 이러한 배열을 객체 배열이라고 한다.
		 */
		
		int[] num = new int[5]; //int형 num 배열 변수에는 0으로 채워진 다섯개의 공간이 있다.
		String[] str = new String[5]; // String형 str 배열 변수에는 null로 채워진 다섯개의 공간이 있다.
		// 그리고 num, str은 힙영역에 생성된 new int[5], new String[5] 의 주소를 각각 담고 있다.
		System.out.println("num="+num);
		System.out.println("str="+str);
		
		Tv[] tvArr = new Tv[5];
		// Tv 클래스 타입의 tvArr 배열 변수는 5개의 객체의 주소를 담고 있다.
		System.out.println(tvArr[0]); // 결과 아무것도 없을것이다.
									// 각 객체의 초기화가 없기때문
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		tvArr[3] = new Tv();
		tvArr[4] = new Tv();
		
		System.out.println("tvArr[0]의 주소는="+tvArr[0]);
		System.out.println("tvArr[1]의 주소는="+tvArr[1]);
		System.out.println("tvArr[2]의 주소는="+tvArr[2]);
		System.out.println("tvArr[3]의 주소는="+tvArr[3]);
		System.out.println("tvArr[4]의 주소는="+tvArr[4]);
		
		System.out.println();
		
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv(), new Tv(), new Tv()};
		System.out.println("tvArr2[0]의 주소는="+tvArr2[0]);
		System.out.println("tvArr2[1]의 주소는="+tvArr2[1]);
		System.out.println("tvArr2[2]의 주소는="+tvArr2[2]);
		System.out.println("tvArr2[3]의 주소는="+tvArr2[3]);
		System.out.println("tvArr2[4]의 주소는="+tvArr2[4]);
		
	}

}
