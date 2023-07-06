package day02;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //키보드 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int kor = sc.nextInt();

        System.out.print("영어점수 : ");
        int eng = sc.nextInt();

        System.out.print("이름 : ");
        sc.nextLine();

        String name = sc.nextLine();


        System.out.println("입력점수 : " + kor + ", " + eng + ", " + name);
    }
}

/**
 * 모니터 출력 - System.out
 * 키보드 입력 - System.in
 */
