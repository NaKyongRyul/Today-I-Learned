package day01;

import java.util.Random;

public class GradeCalculate {
    public static void main(String[] args) {
        String name = "나경률";
        int korean,english, math, allScore;
        double avg;
        char grade;

        //45~100
        korean = (int) (Math.random()*56) + 45;
        english = (int) (Math.random()*56) + 45;

        //난수발생하는 전용 클래스
        Random r = new Random();
        math = r.nextInt(56) + 45;

        math = (int) (Math.random()*56) + 45;

        allScore = korean+english+math;
        avg = allScore/3.0;

        grade = avg >= 90 ? 'A' : 'F';

        System.out.println(name);
        System.out.println(korean);
        System.out.println(english);
        System.out.println(math);
        System.out.println(allScore);
        avg = (int)(avg*100) / 100.0;
        System.out.println(avg);
        System.out.println(grade);
    }
}
