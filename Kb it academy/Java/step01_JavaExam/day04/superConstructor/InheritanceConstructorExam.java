package day04.superConstructor;

class Parent {
	Parent() {
		System.out.println(1);
	}
	Parent(int i) {
		System.out.println(2);
	}
	Parent(String s) {
		System.out.println(3);
	}
}

class Child extends Parent {//Child is Parent 성립 
	Child() {
		//super();//생략 
		//this(10);//1 5 4
		System.out.println(4);
	}
	Child(int i) {
		//super();//생략
		System.out.println(5);
	}
	Child(boolean b) {
		//super();//생략 
		System.out.println(6);
	}
}

public class InheritanceConstructorExam {

	public static void main(String[] args) {
		new Child();//1 4 
//		new Child(10);//1 5
//		new Child(true);//1 6
		
		//결론: 자식이 생성된 부모의 기본생성자 호출
		//     자식 생성자 구현부 첫째줄에 super() 생략되어 있다. 
		
		/**
		 * 만약 부모쪽에 생성자가 하나도 없으면... 자동으로 기본 생성자 삽입되므로 문제 없다.
		 */
//		new Child();//4
//		new Child(10);//5
//		new Child(true);//6
		
		/**
		 * 만약, 부모쪽에 기본생성자 없이 인수가 있는 생성자를 추가한다면 
		 * 모든 자식생성자 구현부 첫째줄에 다른 생성자를 호출해야 한다. 
		 */
	}

}
