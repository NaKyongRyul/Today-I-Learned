package day01;

public class ArrayExam {
    public static void main(String[] args) {
        //명시적 초기화
        int[] arr = new int[] {1,3,5,7,9};
        System.out.println("arr = " + arr);

        int len = arr.length;
        for(int i=0; i<len; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //개선된 for문
        for(int i:arr) {
            System.out.println(i);
        }

        //배열방값 이름
        arr[2] = 100;
        arr[0] = 50;
        for(int i:arr) {
            System.out.println(i);
        }
    }
}
