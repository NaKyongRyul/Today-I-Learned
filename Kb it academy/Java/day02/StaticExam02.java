package day02;

class Test2 {
    int a = 10;
    static int b = 5;

    public void aa() {

    }

    //non-static 메소드 안에서 static, non-static 모두 접근 가능
    public void bb() {
        System.out.println(a);
        System.out.println(this.a);

        System.out.println(b);
        System.out.println(this.b);
        System.out.println(Test2.b);

        //메소드 호출
        aa();
        this.aa();

        cc();
        this.cc(); //권장X
        Test2.cc();
    }

    public static void cc() {

    }

    //static 메소등 내에서 static만 접근가능, this 사용불가
    //static 메소드는 객체를 생성안해도 쓸 수 있음 -> 생성한지 아닌지 미리 판단 X -> non-static 변수와 메소드는 생성해야지 사용 가능 -> 그러므로 사용불가
    public static void dd() {
        //System.out.println(a);
        //System.out.println(this.a);

        System.out.println(b);
        //System.out.println(this.b);
        System.out.println(Test2.b);


        //메소드 호출
        //aa();
        //this.aa();

        cc();
        //this.cc(); //권장X
        Test2.cc();
    }
}

public class StaticExam02 {
}
