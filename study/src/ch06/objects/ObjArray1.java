package ch06.objects;

/*
 * 6
 * 2.5.��ü �迭
 */
public class ObjArray1 {

	public static void main(String[] args) {
		/*
		 * ��ü �迭
		 * �迭�� ���� Ÿ���� ������ ��� ���� ���� ������ �ǹ��Ѵ�.
		 * �׷���, ���� ��ü��� Ÿ������ �迭�� ����� �ִ�.
		 * �̷��� �迭�� ��ü �迭�̶�� �Ѵ�.
		 */
		
		int[] num = new int[5]; //int�� num �迭 �������� 0���� ä���� �ټ����� ������ �ִ�.
		String[] str = new String[5]; // String�� str �迭 �������� null�� ä���� �ټ����� ������ �ִ�.
		// �׸��� num, str�� �������� ������ new int[5], new String[5] �� �ּҸ� ���� ��� �ִ�.
		System.out.println("num="+num);
		System.out.println("str="+str);
		
		Tv[] tvArr = new Tv[5];
		// Tv Ŭ���� Ÿ���� tvArr �迭 ������ 5���� ��ü�� �ּҸ� ��� �ִ�.
		System.out.println(tvArr[0]); // ��� �ƹ��͵� �������̴�.
									// �� ��ü�� �ʱ�ȭ�� ���⶧��
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		tvArr[3] = new Tv();
		tvArr[4] = new Tv();
		
		System.out.println("tvArr[0]�� �ּҴ�="+tvArr[0]);
		System.out.println("tvArr[1]�� �ּҴ�="+tvArr[1]);
		System.out.println("tvArr[2]�� �ּҴ�="+tvArr[2]);
		System.out.println("tvArr[3]�� �ּҴ�="+tvArr[3]);
		System.out.println("tvArr[4]�� �ּҴ�="+tvArr[4]);
		
		System.out.println();
		
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv(), new Tv(), new Tv()};
		System.out.println("tvArr2[0]�� �ּҴ�="+tvArr2[0]);
		System.out.println("tvArr2[1]�� �ּҴ�="+tvArr2[1]);
		System.out.println("tvArr2[2]�� �ּҴ�="+tvArr2[2]);
		System.out.println("tvArr2[3]�� �ּҴ�="+tvArr2[3]);
		System.out.println("tvArr2[4]�� �ּҴ�="+tvArr2[4]);
		
	}

}
