package day05.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam02 extends ArrayList<Integer>{
	
	public ListExam02() {
		super(5);
		//객체를 사용할 때 -> 1. 상속  2. 생성 
		super.add(5);
		this.add(4);
		add(3);
		add(2);
		add(1);
		add(10);
		
		//출력 
		System.out.println(this);//list.toString() 호출 --> 오버라이딩으로 [,]가 출력 
		System.out.println("저장된 개수: " + size());
		
		//요소를 하나씩 꺼내기 
		for(int i=0; i<size(); i++) {
			int data = get(i);
			System.out.println(data);
		}
		
		//요소 제거
		remove(0);//인덱스로 인식 
		
		System.out.println("저장된 개수: " + size());
		
		//요소를 하나씩 꺼내기 
		for(int i=0; i<size(); i++) {
			int data = get(i);
			System.out.println(data);
		}
		
		//정렬 
		Collections.sort(this);
		
		//정렬 후 
		System.out.println("정렬 후: "  + this);
	}
	public static void main(String[] args) {
		new ListExam02();
	}

}
