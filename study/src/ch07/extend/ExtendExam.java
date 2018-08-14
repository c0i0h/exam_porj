package ch07.extend;

/*
 * 7.01. 상속(inheritance) p316
 * 7.02. 클래스간의 관계 - 포함관계
 */
public class ExtendExam {
	
	ExtendExam() {
		System.out.println("--- 7.01. 상속(inheritance) ---");
	}
	public static void main(String[] args) {
		new ExtendExam();
		new Child();
		new Child2();
		new GrandChild();
		
		Other other = new Other();
		System.out.println("- ExtendExam 객체는 Other 객체를 포함한다");
	}

}
class Parent {
	int age = 0;
}
class Child extends Parent {
	Child(){
		System.out.println("- Child 클래스는 age를 가지고 있지 않으나 Parent에게 상속받은 age=" +super.age);
	}
}
class Child2 extends Parent {
	Child2() {
		System.out.println("- Child2 클래스는 age를 가지고 있지 않으나 Parent에게 상속받은 age=" +super.age);
	}
}

class GrandChild extends Child {
	GrandChild() {
		System.out.println("- GrandChild 클래스는 age를 가지고 있지 않으나 Parent에게 상속받은 age=" +super.age);
		System.out.println("Child 클래스를 상속 받았지만 Child 클래스에는 직접적으로 age 멤버 변수가 없다.");
		System.out.println("하지만 Child 클래스가 Parent에게 상속받은 age가 있기에  Child 클래스에는  age 멤버 변수가 있는 것으로 간주한다.");
		System.out.println("그러므로 GrandChild 클래스는 age를 사용할수 있게 된다.");
	}
}

class Other extends Object {
	Other() {
		System.out.println("- 객체는 기본적으로 Object 객체를 상속 받는다.");
	}
}
