package ch06.values;
/*
 * 6.4 ����� �ʱ�ȭ �ñ�� ����
 */
public class ProductTest {

	public static void main(String[] args) {
		System.out.println("6-4. (1)��������� �ʱ�ȭ");
		//System.out.println("6-4. (2)�������� �ʱ�ȭ");
		System.out.println("(2) - static void main, JVM �� ���� ���� ������(��ü�� ���� ��������)");
		new Product();
		/*Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product("Red");
		
		System.out.println("p1�� serialNo="+p1.serialNo);
		
		System.out.println("p2�� serialNo="+p2.serialNo);
		
		System.out.println("p3�� serialNo="+p3.serialNo);
		
		System.out.println("p4�� serialNo="+p4.serialNo);

		System.out.println("count="+Product.count);*/
	}

}

class Product {
	static int count = 0; //(1) �޸� ������ ���� �ѹ��� �����ϰ�, ������ �ν��Ͻ��� �����Ҷ����� �������� �ʴ´�.
	int serialNo;		  //(1) ���� �ѹ� ��������, ������ �ν��Ͻ��� �����ɶ����� ������.
	String color;		  //(1) ���� �ѹ� ��������, ������ �ν��Ͻ��� �����ɶ����� ������. 
	
	{
		++count;
		serialNo = count;
		System.out.println("(4) - {} �ʱ�ȭ ��");
		//���⼭ ����� ���� ������ �ٸ��������� ����Ҽ� ����.
		//���������� ���������� ���������� ����Ѵ�.
		//���� ����� �������.
	}
	
	//main() �Լ����� �ʰ� ���� �Ǵ� Product ��ü�̱⶧���� main() �Լ� ���ķ� ����Ǿ���
	static {
		//++count;			// �������
		//serialNo = count;	// error, �Ϲݺ����� static ������ ������ ����.
		System.out.println("(3) - static {} �ʱ�ȭ ��");
		//���⼭ ����� ���� ������ �ٸ��������� ����Ҽ� ����.
		//���������� ���������� ���������� ����Ѵ�.
		//���� ����� �������.
	}
	
	public Product() {
		//++count;			// �������
		//serialNo = count;	// �������
		color = "white";
		System.out.println("(5) - ������");
	}
	
	// ������ ������ ������ �ڵ����� �����ϰ� ������ 
	public Product(String color) {
		//++count;			// �������
		//serialNo = count;	// �������
		this.color = "white";
		System.out.println("(5) - ������(�Ű�����1��)");
	}
}