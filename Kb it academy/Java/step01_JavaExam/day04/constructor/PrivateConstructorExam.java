package day04.constructor;

/**
 * 싱글톤 클래스 작성방법
 * 1) private 생성자 만든다.
 * 2) 멤버필드로 static 자기자신타입 선언
 * 3) public static를 제공하여 객체를 생성할 수 있도록 한다.
 */
class Test {
	private static Test instance = new Test();//외부에서 Test.instance 못하도록 private 설정 

	//외부에서 객체 생성 직접 불가 
	private Test() {}
	
	/**
	 * 자기자신객체를 직접 생성해서 리턴해주는 메소드 제공 
	 */
	public static Test getInstance() {
		return instance;
	}
}

public class PrivateConstructorExam {
	public static void main(String[] args) {
		//new Test();//private 생성자라서 안된다.
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);

	}

}
