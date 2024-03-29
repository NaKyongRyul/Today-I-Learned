package day02;

class MakeMethodExam02{

/*
	Method이름 : methodExam02_01
	자기자신만 접근가능
	Return Type : 정수
	Parameter : 정수2개
	(구현부에서)하는일 : 인수로 받은(들어온) 두개의 정수의 합을 출력하고
		두정수의 합이 3의 배수이면 "3의 배수"출력
		두정수의 합 리턴
*/

	private int methodExam02_01(int i , int j){//33  22
		int sum = i + j;
		System.out.println("두 정수의 합 : " + sum);
		if(sum%3==0)System.out.println("3의배수");

		return sum;
	}


/*	Method이름 : methodExam02_02
	어디서나 아무나 접근
	Return Type : String
	Parameter : String
	(구현부에서)하는일 : 인수로 받은(들어온) String에 바보를 붙여서 출력
			     인수로 받은 (들어온)String에 바보를 붙여서 리턴
*/

	//제한자 리턴타입 메소드이름(인수, 인수...){}
	public String methodExam02_02(String str){//장희정
		System.out.println(str+"바보");

		return str+"바보";
	}

	/*
        Method이름 : methodExam02_03
        같은 package에서 아무나 접근가능
        Return Type : 리턴안합
        Parameter : 정수1개 와 String 1개
        (구현부에서)하는일 : 인수로 받은 정수와 String을 (하나의 String으로) 붙여서 출력
            인수로 받은정수가 4의 배수라면 1출력, 아니라면 0출력
    */
	//제한자 리턴타입 메소드이름(인수, 인수...){}
	void methodExam02_03(int i, String s){//42, "이뿌니~"
		String result = i+s;
		System.out.println("result = " + result);
		if(i%4==0)System.out.println(1);
		else System.out.println(0);
	}

/*
	Method이름 : methodExam02_04
	상속관계라면 어디서나 접근가능
	Return Type : 실수(부동소수형)
	Parameter :첫번째인수(정수),두번째 인수(실수),세번째 인수(정수)
	(구현부에서)하는일 : 첫번째 인수 곱하기 두번째인수 빼기 세번째인수 결과 출력
			     위의 결과를 리턴
*/

	protected double methodExam02_04(int i , double j , int k ){//5, 3.5, 10
		double result  = i*j-k;
		System.out.println("연산결과 : " + result);
		return result;
	}


	public static void main(String [] args){
		MakeMethodExam02 mme = new MakeMethodExam02();
		int k = mme.methodExam02_01(33, 22);
		System.out.println(k);

		String s = mme.methodExam02_02("장희정");
		System.out.println(s);

		mme.methodExam02_03(42, "이뿌니~");

		//double d = mme.methodExam02_04(7, 5.5, 8);
		// System.out.println(d);

		System.out.println(  mme.methodExam02_04(7, 5.5, 8)   );
	}
}

