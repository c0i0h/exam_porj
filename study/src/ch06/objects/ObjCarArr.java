package ch06.objects;

/*
 * 6
 * 2.5.��ü �迭 ��
 */
public class ObjCarArr {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // ���� ��ü Ÿ���� ��ü �迭, ũ�Ⱑ  3�� �迭 ����
		
		// �迭 ��ü ���� ��ü�� ���� �����Ͽ� ����� �̿��Ѵ�.
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10; // ä�� ����
		}
		System.out.println();
		// �迭 ��ü ���� ��ü�� ���� �����Ͽ� ����� �����ϰų� ����Ѵ�.
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();		// ä�� ����
			System.out.printf("tvArr[%d].channel=%d",
								i,tvArr[i].channel); // ä�� ���
			System.out.println();
		}
	}

}