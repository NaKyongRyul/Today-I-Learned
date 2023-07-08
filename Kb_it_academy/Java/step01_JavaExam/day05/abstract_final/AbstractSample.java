package day05.abstract_final;

/**
 * 상속 이유 - 공통의 속성 및 메소드를 부모쪽에 정의하고 extends 키워드로 재사용성, 확장성 좋게 만들기 위해서 
 */

abstract class Animal {//상속해서 사용 
	//공통의 속성
	int legs;
	//공통의 메소드
	public void eat() {
		System.out.println("고기를 좋아한다.");
	}
	public void sound() {}//재정의를 위한 메소드
	public abstract void run();
}

class Pig extends Animal {
	public void sound() {
		System.out.println("꿀꿀");
	}
	public void run() {//오버라이딩 
		System.out.println("못 달린다.");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("야옹");
	}
	public void run() {
		System.out.println("잘 달린다.");
	}
}

public class AbstractSample {

	public static void main(String[] args) {
		System.out.println("---Pig---");
		test(new Pig());
		
		System.out.println("---Cat---");
		test(new Cat());
	}

	public static void test(Animal an) {//매개변수를 이용한 다형성 
		an.eat();
		an.sound();//재정의가 되었기때문에 재정의된 메소드 호출 
		an.run();
	}
}
