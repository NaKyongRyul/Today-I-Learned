package day02;

class Test {
    int a = 10; //non-static 변수 = 인스턴스 변수
    static int b = 5; //static = 공유
}

public class StaticExam {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println("t1 = " + t1);
        System.out.println("t1 = " + t2);
        System.out.println("t1 = " + t3);

        System.out.println("--non-static variable 변경 전--");
        System.out.println("t1.a = " + t1.a);
        System.out.println("t1.a = " + t2.a);
        System.out.println("t1.a = " + t3.a);

        //값 변경
        t2.a = 50;

        System.out.println("--non-static variable 변경 후--");
        System.out.println("t1.a = " + t1.a);
        System.out.println("t1.a = " + t2.a);
        System.out.println("t1.a = " + t3.a);



        System.out.println("--static variable 변경 전--");
        System.out.println("t1.a = " + Test.b);
        System.out.println("t1.a = " + Test.b);
        System.out.println("t1.a = " + Test.b);

        //값 변경
        Test.b = 50;

        System.out.println("--static variable 변경 후 --");
        System.out.println("t1.a = " + Test.b);
        System.out.println("t1.a = " + Test.b);
        System.out.println("t1.a = " + Test.b);
    }
}
