package day05.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam01 {
	List<Integer> list = new ArrayList<>(5);//5개 공간 
	
	public ListExam01() {
		//객체를 사용할 때 -> 1. 상속  2. 생성 
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(10);
		
		//출력 
		System.out.println(list);//list.toString() 호출 --> 오버라이딩으로 [,]가 출력 
		System.out.println("저장된 개수: " + list.size());
		
		//요소를 하나씩 꺼내기 
		for(int i=0; i<list.size(); i++) {
			int data = list.get(i);
			System.out.println(data);
		}
		
		//요소 제거
		list.remove(0);//인덱스로 인식 
		
		System.out.println("저장된 개수: " + list.size());
		
		//요소를 하나씩 꺼내기 
		for(int i=0; i<list.size(); i++) {
			int data = list.get(i);
			System.out.println(data);
		}
		
		//정렬 
		Collections.sort(list);
		
		//정렬 후 
		System.out.println("정렬 후: "  + list);
	}
	public static void main(String[] args) {
		new ListExam01();
	}

}
