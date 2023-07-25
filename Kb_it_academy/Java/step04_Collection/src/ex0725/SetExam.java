package ex0725;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam  extends HashSet<String>{
    public SetExam(String [] args) {
    	super();
    	
    	//추가
    	for(String s : args) {
    	  boolean result = super.add(s);
    	  System.out.println(s+" 추가 결과 = "+ result);
    	}
    	
    	System.out.println("저장된 개수 : "+ super.size());
    	System.out.println( this);
    	
    	
    	/**
    	 * Iterator interface 는  collection에 있는 모든 자료구조안에
    	 * 있는 요소를 꺼내는 전용 interface
    	 * list,set, map 모두 Iterator를 이용해서 요소를 하나씩 꺼낼수 있다.
    	 * */
    	System.out.println("**요소를 하나씩 출력 ****");
    	Iterator<String> it = super.iterator();
    	while(it.hasNext()) {//요소가 존재한다면
    		String name = it.next();//요소를 꺼낸다
    		System.out.println(name);
    	}
    	
    	System.out.println("**개선된 for 이용 *****");
    	for(String name : this) {
    		System.out.println(name);
    	}
    	
    	 // 제거
    	boolean re = super.remove("효리2");
    	if(re) {
    		System.out.println("제거성공 = " + this);
    	}else {
    		System.out.println("제거 실패 = " +  this);
    	}
    	
    }
	public static void main(String[] args) {
		new SetExam(args);

	}

}




