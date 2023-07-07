package day05.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 {
	List<Student> list = new ArrayList<>();
	
	public ListExam03() {
		//추가
		list.add(new Student(200, "희정", 15, "서울"));
		list.add(new Student(400, "희정2", 20, "서울2"));
		list.add(new Student(300, "희정3", 40, "서울3"));
		list.add(new Student(100, "희정4", 27, "서울4"));
		list.add(new Student(500, "희정5", 30, "서울5"));
		
		print(list);
		
		//학번을 기준으로 정렬 - Comparable(직접 객체가 구현해서 사용한다) 
		List<Student> sortList = new ArrayList<>(list);//얕은복사 
		Collections.sort(sortList);
		
		System.out.println("---학번으로 정렬---");
		print(sortList);
		
		System.out.println("---원본으로 정렬---");
		print(list);
		
		/**
		 * 나이 정렬 
		 */
		sortList = new ArrayList<>(list);
		Collections.sort(sortList, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("---나이로 정렬---");
		print(sortList);
		
	}

	/**
	 * 출력하기
	 */
	public void print(List<Student> list) {
		System.out.println("---출력하기---");
		for(Student s:list) {//list.get(index) 대신 사용 
			System.out.println(s);//s.toString()
		}
	}
	
	
	
	public static void main(String[] args) {
		new ListExam03();
	}

}
