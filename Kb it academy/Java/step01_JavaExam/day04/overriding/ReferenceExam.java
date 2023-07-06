package day04.overriding;

class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){ 
		this.str = str;
	}
	public String toString() {
		return str;
	}
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			ObjectExam oe1=new ObjectExam("Hi");
			ObjectExam oe2=new ObjectExam("안녕");
			System.out.println(c);//
			
			/**
			 * print(Object obj) or println(Object obj) 메소드는
			 * obj.toString() 자동 호출하고 toString() 리턴하는 문자열을 출력한다.
			 * 
			 * Object에 정의되어있는 toString()메소드는 
			 * getClass().getName() + '@' + Integer.toHexString(hashCode())
			 * 호출해서 문자열로 리턴한다. 
			 * 
			 * String은 toString() 메소드를 재정의해서 문자열을 리턴한다. 
			 */
			
			//toString()가 생략되어 있음 
			System.out.println(s01.toString());//장희정 
			System.out.println(s02);//Java
			System.out.println(s03);//월요일 
			System.out.println(oe1);//주소값 
			System.out.println(oe2);//주소값 
			
	}
}
