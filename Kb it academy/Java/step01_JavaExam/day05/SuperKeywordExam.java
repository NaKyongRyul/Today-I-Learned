package day05;

class Parent {
	int a = 10;
	int b = 5;
	
	public void aa() {
		System.out.println("super aa()");
	}
	
	public void bb() {
		System.out.println("super bb()");
	}
}

class Child extends Parent {//Child is Parent
	int a = 50;
	int c = 30;
	
	public void aa() {
		System.out.println("sub aa()");
	}
	public void cc() {
		System.out.println("sub cc()");
	}
	public void dd() {
		System.out.println(a);//50
		System.out.println(this.a);//50
		System.out.println(super.a);//10
		
		System.out.println("------------------");
		
		System.out.println(b);//5
		//부모쪽에 정의된 것은 this, super로 모두 접근 가능 
		System.out.println(this.b);//5
		System.out.println(super.b);//5

		System.out.println("------------------");
		
		System.out.println(c);//5
		System.out.println(this.c);//5
		//System.out.println(super.c);//부모에 c가 없어서 오류 
		
		System.out.println("---메소드 호출---");
		aa();//sub
		this.aa();//sub
		super.aa();//super
		
		System.out.println("------------------");
		bb();//super
		this.bb();//super
		super.bb();//super
		
		System.out.println("------------------");
		cc();//sub
		this.cc();//sub
		//super.cc();//오류 
	}
}

public class SuperKeywordExam {

	public static void main(String[] args) {
		//new Child().dd();//일회성 
		Child ch = new Child();
		System.out.println("ch = " + ch);
		System.out.println(ch.a);//50
		System.out.println(ch.b);//5
		System.out.println(ch.c);//30
		
		ch.aa();//sub
		ch.bb();//super
		ch.cc();//sub
		
		Parent p = new Child();
		System.out.println("p = " + p);
		System.out.println(p.a);//10
		System.out.println(p.b);//5
		//부모타입으로 자식부분 접근 불가 -> ObjectDownCasting 필요 
		//System.out.println(p.c);//접근불가 
		
		//재정의된 메소드는 부모 타입이라도 재정의된 메소드는 재정의된 메소드가 호출 
		p.aa();//sub
		p.bb();//super
		//p.cc();
		
		
		if(p instanceof Child) {
			Child ch2 = (Child)p;//다운캐스팅
			System.out.println("ch2 = " + ch2);
			ch2.cc();
		}
	}

}
