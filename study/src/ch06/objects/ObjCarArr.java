package ch06.objects;

/*
 * 6
 * 2.5.객체 배열 예
 */
public class ObjCarArr {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 같은 객체 타입의 객체 배열, 크기가  3인 배열 선언
		
		// 배열 객체 안의 객체에 각각 접근하여 멤버를 이용한다.
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10; // 채널 지정
		}
		System.out.println();
		// 배열 객체 안의 객체에 각각 접근하여 멤버를 접근하거나 출력한다.
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();		// 채널 증가
			System.out.printf("tvArr[%d].channel=%d",
								i,tvArr[i].channel); // 채널 출력
			System.out.println();
		}
	}

}