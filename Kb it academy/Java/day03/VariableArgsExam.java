package day03;

class Test {
    public void aa(Object ... i) { //출력이 주소값으로 나오니 배열로 인식
        System.out.println(i);
        System.out.println(i.length);
        for(Object a : i) {
            System.out.println(a);
        }
    }
}


public class VariableArgsExam {
    public static void main(String[] args) {
        Test t = new Test();
        t.aa(2);
        t.aa();
        t.aa(2, 3);
        t.aa("str");
    }
}
