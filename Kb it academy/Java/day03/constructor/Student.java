package day03.constructor;

/**
 * 학생의 정보 = 속성을 관리하는 객체
 * VO(Value Object), DTO(Data Transfer Object), Domain
 */

public class Student {
    String name;
    int age;
    String addr;

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
}
