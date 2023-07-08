package day04encapsulation;

/**
 * 학생의 정보 = 속성을 관리하는 객체
 * VO(Value Object), DTO(Data Transfer Object), Domain
 * 멤버필드를 외부에서 직접 접근할 수 없도록 private 선언
 * setXxx, getXxx을 제공하여 메소드를 이용하여 접근할 수 있도록 한다.
 */

public class Student {
    private String name;
    private int age;
    private String addr;

    public Student() {}
    //생성자
    public Student(String name, int age, String addr) {
        this(name, age);
        this.addr = addr;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * setXxx, getXxx 추가 
     */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 18) this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
    

    
}
