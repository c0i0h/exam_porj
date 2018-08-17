package ch07.extend;

/*
 * 7.01. ���(inheritance) p316
 * 7.02. Ŭ�������� ���� - ���԰���
 */
public class ExtendExam {
	
	ExtendExam() {
		System.out.println("--- 7.01. ���(inheritance) ---");
	}
	public static void main(String[] args) {
		new ExtendExam();
		Child c1 = new Child();
		Child2 c2 = new Child2();
		GrandChild gc = new GrandChild();
		GrandChild2 gc2 = new GrandChild2();
		
		Other other = new Other();
		System.out.println("- ExtendExam ��ü�� Other ��ü�� �����Ѵ�.");
		
		//c1.printMe();
		//c2.printMe();
		//gc.printMe();
		//gc2.printMe();
		
		
		Parent gc3 = new GrandChild2();
		gc3.printMe();
		
	}

}
class Parent {
	int age = 0;
	void printMe() {
		System.out.println("Parent �� printMe() �޼ҵ�~");
	}
}
class Child extends Parent {
	Child(){
		System.out.println("- Child Ŭ������ age�� ������ ���� ������ Parent���� ��ӹ��� age=" +super.age);
	}
}
class Child2 extends Parent {
	Child2() {
		System.out.println("- Child2 Ŭ������ age�� ������ ���� ������ Parent���� ��ӹ��� age=" +super.age);
	}
	
	//@Override
	void printMe() {
		System.out.println("Child2 �� printMe() �޼ҵ�~");
	}
}

class GrandChild extends Child2 {
	GrandChild() {
		System.out.println("- GrandChild Ŭ������ age�� ������ ���� ������ Parent���� ��ӹ��� age=" +super.age);
		System.out.println("Child Ŭ������ ��� �޾����� Child Ŭ�������� ���������� age ��� ������ ����.");
		System.out.println("������ Child Ŭ������ Parent���� ��ӹ��� age�� �ֱ⿡  Child Ŭ��������  age ��� ������ �ִ� ������ �����Ѵ�.");
		System.out.println("�׷��Ƿ� GrandChild Ŭ������ age�� ����Ҽ� �ְ� �ȴ�.");
	}
}

class GrandChild2 extends Child2 {
	
}

class Other extends Object {
	Other() {
		System.out.println("- ��ü�� �⺻������ Object ��ü�� ��� �޴´�.");
	}
}
