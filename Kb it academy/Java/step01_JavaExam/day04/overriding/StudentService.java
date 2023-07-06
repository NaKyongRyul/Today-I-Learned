package day04.overriding;

/**
 * 학생들의 정보를 관리하는 Business Logic 클래스
 * ex) 등록, 수정, 삭제, 전체검색, 부분검색...
 */

public class StudentService {
    Student[] stArr = new Student[5];

    /**
     * 학생 5명 초기화
     */
    public StudentService() {
        stArr[0] = new Student("경률", 26, "김해");
        stArr[1] = new Student("성현", 26);
        stArr[2] = new Student("재원", 26, "서울");
        stArr[3] = new Student("민석", 27, "울산");
        stArr[4] = new Student("철환", 27);
    }

    /**
     * 전체학생 검색
     */
    public Student[] selectAll() {
        return stArr;
    }

    /**
     * 이름에 해당하는 학생정보 검색
     * 이름은 중복 X(pk)
     * return: 찾으면 Student, 못찾으면 null
     * param: 찾을 이름
     */
    public Student selectByName(String name) {
        for(Student s : stArr) {
            if(s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}
