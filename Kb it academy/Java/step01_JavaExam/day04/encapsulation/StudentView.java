package day04encapsulation;

public class StudentView {
    public static void main(String[] args) {
        System.out.println("====학생 관리 프로그램====");
        StudentService service = new StudentService();//전역변수 초기화, 생성자 호출

        System.out.println("1. 전체 학생 검색");
        Student[] arr = service.selectAll();

        for(Student s : arr) {
            System.out.printf("%s | %d | %s%n", s.getName(), s.getAge(), s.getAddr());
        }

        System.out.println("\n2. 이름에 해당하는 학생 정보 검색");
        Student s = service.selectByName("경률");
        if(s != null) {
            System.out.printf("%s | %d | %s%n", s.getName(), s.getAge(), s.getAddr());
        } else {
            System.out.println("찾는 정보가 없습니다.");
        }
    }
}
