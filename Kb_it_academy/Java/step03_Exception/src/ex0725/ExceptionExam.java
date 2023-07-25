package ex0725;

public class ExceptionExam {

	public static void main(String[] args) {//jvm 호출
		System.out.println("***메인 시작하기 **************");

		/*System.out.println("args = " +args);
		System.out.println("args.length = " + args.length);
		for(String s : args)
			System.out.println(s);*/
		try {
		  String data = args[0];
		  System.out.println("전달된 값 = " + data);
		  
		  int convertNo = Integer.parseInt(data) ; //문자열-> 숫자로 변환
		  System.out.println("변환 결과 = " + convertNo);
		  
		  int result = 100/ convertNo;//ArithmeticException 가능성
		  System.out.println("나눈 결과 = " +  result);
		  
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외가 발생했을때 해야할 일작성
			System.out.println("e = "+ e);//e.toString()호출
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요 = " +  e.getMessage());
		}catch (Exception e) {
			e.printStackTrace(); //개발모드에서는 사용하지만 배포(운영)모드에서는 제거
		}finally {
			System.out.println("예외발생여부 상관없이 무조건 실행한다!!!");
		}
		
		System.out.println("***메인 끝 ********************");
	}

}
////////////////////////////////////////////////
/*실행
 *   java ExceptionExam 값 값 값 값.....
 * 
 * */




