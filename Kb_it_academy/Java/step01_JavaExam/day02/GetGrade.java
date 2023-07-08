package day02;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


class GradeProgram {
	private int getSum(int korean, int english, int math) {
		return korean + english + math;
	}
	
	private double getAvg(int sum) {
		return sum/3.0;
	}
	
	private char getGrade(double avg) {
		if(avg>=90) {
			return 'A';
		} else if(avg>=80) {
			return 'B';
		} else if(avg>=70) {
			return 'C';
		} else if(avg>=60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public void printScreeen(String name, int korean, int english, int math) {
		int sum = getSum(korean, english, math);
		double avg = getAvg(sum);
		char grade = getGrade(avg);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("등급: " + grade);
	}
}

public class GetGrade {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		GradeProgram gp = new GradeProgram();//이거 위치 맞는지 질문하기
		
		while(true) {
			System.out.println("1. 성적표구하기     2. 종료");
			
			int menu = Integer.parseInt(br.readLine());
			
			if(menu == 1) {
				System.out.print("이름: ");
				String name = br.readLine();
				
				System.out.print("국어: ");
				int korean = Integer.parseInt(br.readLine());
				
				System.out.print("영어: ");
				int english = Integer.parseInt(br.readLine());

				System.out.print("수학: ");
				int math = Integer.parseInt(br.readLine());

				gp.printScreeen(name, korean, english, math);

				continue;
			} else if(menu == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}

}
