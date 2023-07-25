package ex0725;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<>();
	
    public MemberSetExam() {
    	//추가
    	set.add(new Member("희정",10, "서울"));
    	set.add(new Member("희정",10, "대구"));
    	set.add(new Member("희정",10, "부산"));
    	
    	System.out.println("저장된 객체 개수 : " + set.size());
    	
    }
	public static void main(String[] args) {
		new MemberSetExam();

	}

}
