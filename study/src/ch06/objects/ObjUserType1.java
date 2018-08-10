package ch06.objects;

public class ObjUserType1 {

	public static void main(String[] args) {
		ObjUserType time = new ObjUserType();
		
		// ObjUserType 힙타입 변수 time에는 new ObjUserType(); 의 결과 주소가 담긴다.
		// 하지만 주소를 확인하려 시도하면 주소가 안나온다.
		// ObjUserType 객체는 부모객체 Object 의 toString() 메서드를 Override 하였기때문이다.
		// 주소가 출력되어야할 toString() 메서드는 시분초의 합쳐진 결과를 출력하도록 재정의 되었음을 조심하고
		
		// time 이라는 힙타입 변수를 통해서 멤버를 접근한다.		
		time.setHour(18);
		time.setMinute(20);
		time.setSecond(50);
		
		// 원래는 time.getHour(), time.getMinute(), time.getSecode() 의  함수를 이용해야 하지만
		// 귀찮아서 부모객체에서 가져와서 재정의한 메서드 toString()으로 대신 처리 하였다.
		// 원래의 기능을 이용하여 분리하여 사용하도 되고, 재정의된 toString()을 이용하여 통으로 출력해도 된다.
		// 실제 Time 을 구해오는 클래스는 다른 형식으로 출력되는데,
		// 여기서는 ObjUserType 이라는 클래스로 새로운 타입으로 정의해 보았다.
		// 이런것을 사용자 정의 타입 이라고도 한다.
		System.out.println(time);

	}

}

class ObjUserType {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }
	
	public void setHour(int h) {
		if(h < 0 || h > 23) return;
		hour = h;
	}
	public void setMinute(int m) {
		if(m < 0 || m > 59) return;
		minute = m;
	}
	public void setSecond(int s) {
		if(s < 0.0f || s > 59.99f) return;
		second = s;
	}

	// Object를 암북적 상속받은 상태에서 의 toString() 을 Override 한 경우
	// 객체의 주소가 출력 되지 않고, 아래의 재정의 된 결과가 출력 된다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		String result;
		result = hour+"시 "+ minute + "분 " + second + "초 입니다.";
		return result;
	}
	
}