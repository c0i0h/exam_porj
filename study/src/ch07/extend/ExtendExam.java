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
		new Child();
		new Child2();
		new GrandChild();
		
		Other other = new Other();
		System.out.println("- ExtendExam ��ü�� Other ��ü�� �����Ѵ�");
	}

}
class Parent {
	int age = 0;
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
}

class GrandChild extends Child {
	GrandChild() {
		System.out.println("- GrandChild Ŭ������ age�� ������ ���� ������ Parent���� ��ӹ��� age=" +super.age);
		System.out.println("Child Ŭ������ ��� �޾����� Child Ŭ�������� ���������� age ��� ������ ����.");
		System.out.println("������ Child Ŭ������ Parent���� ��ӹ��� age�� �ֱ⿡  Child Ŭ��������  age ��� ������ �ִ� ������ �����Ѵ�.");
		System.out.println("�׷��Ƿ� GrandChild Ŭ������ age�� ����Ҽ� �ְ� �ȴ�.");
	}
}

class Other extends Object {
	Other() {
		System.out.println("- ��ü�� �⺻������ Object ��ü�� ��� �޴´�.");
	}
}
