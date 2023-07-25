package ex0725;

import java.io.IOException;

public class ThrowsExam {
	public void aa(int i) throws ArithmeticException, IOException{
        System.out.println("aa()메소드 호출됨....");
        try {
		// try {
           this.bb(i);
		// }catch (ArithmeticException e) {
		//	System.out.println("0으로 나눌수 없어요~");
		//}
        }finally {
		  System.out.println("aa()메소드 끝 .....");
        }
	}
	
	public void bb(int i)throws ArithmeticException , IOException{
		System.out.println("bb()메소드 호출됨....");
		try {
			if(i<0) {//음수다
				//RuntimeException e = new RuntimeException(); //비체크예외
				IOException e = new IOException("음수를 사용할 수 없어요.");//체크예외
				throw e; //예외를 강제로 발생시켜라.
			}
			
			int result = 100/ i; //ArithmeticException 가능성
			System.out.println("나눈 결과 : " +  result);
		}finally {
			System.out.println("bb()메소드 끝 .....");
		}
	}

	public static void main(String[] args) {
       System.out.println("****메인 시작하기 ******");
       ThrowsExam  te = new ThrowsExam();
       try {
         //te.aa(5);
         //te.aa(0);
    	   te.aa(-10);
       }catch (ArithmeticException | IOException e) {
		 System.out.println("예외가 발생했어요~~ => " + e.getMessage());
	   }
       System.out.println("***메인 끝 **************");

	}

}
