package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUseKeyboardExam {
    public static void main(String[] args) throws IOException {
        /* InputStream is = System.in;
        System.out.print("입력 : ");

        int i = is.read();//1byte 읽기
        System.out.println("i = " + i + ", " + (char)i); */

        //InputStream ---> Reader로 변환
        //InputStreamReader ir = new InputStreamReader(System.in);
        //int i = ir.read();//한문자 읽기
        //System.out.println("i = " + i + ", " + (char)i);

        //한줄씩 읽기 - 입출력 속도를 높이는 Buffered 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("s = "  + s);
    }
}
