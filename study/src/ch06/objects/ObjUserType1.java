package ch06.objects;

public class ObjUserType1 {

	public static void main(String[] args) {
		ObjUserType time = new ObjUserType();
		
		// ObjUserType ��Ÿ�� ���� time���� new ObjUserType(); �� ��� �ּҰ� ����.
		// ������ �ּҸ� Ȯ���Ϸ� �õ��ϸ� �ּҰ� �ȳ��´�.
		// ObjUserType ��ü�� �θ�ü Object �� toString() �޼��带 Override �Ͽ��⶧���̴�.
		// �ּҰ� ��µǾ���� toString() �޼���� �ú����� ������ ����� ����ϵ��� ������ �Ǿ����� �����ϰ�
		
		// time �̶�� ��Ÿ�� ������ ���ؼ� ����� �����Ѵ�.		
		time.setHour(18);
		time.setMinute(20);
		time.setSecond(50);
		
		// ������ time.getHour(), time.getMinute(), time.getSecode() ��  �Լ��� �̿��ؾ� ������
		// �����Ƽ� �θ�ü���� �����ͼ� �������� �޼��� toString()���� ��� ó�� �Ͽ���.
		// ������ ����� �̿��Ͽ� �и��Ͽ� ����ϵ� �ǰ�, �����ǵ� toString()�� �̿��Ͽ� ������ ����ص� �ȴ�.
		// ���� Time �� ���ؿ��� Ŭ������ �ٸ� �������� ��µǴµ�,
		// ���⼭�� ObjUserType �̶�� Ŭ������ ���ο� Ÿ������ ������ ���Ҵ�.
		// �̷����� ����� ���� Ÿ�� �̶�� �Ѵ�.
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

	// Object�� �Ϻ��� ��ӹ��� ���¿��� �� toString() �� Override �� ���
	// ��ü�� �ּҰ� ��� ���� �ʰ�, �Ʒ��� ������ �� ����� ��� �ȴ�.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		String result;
		result = hour+"�� "+ minute + "�� " + second + "�� �Դϴ�.";
		return result;
	}
	
}