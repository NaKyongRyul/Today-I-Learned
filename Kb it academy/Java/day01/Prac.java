package day01;

public class Prac {
    public static void main(String[] args) {
outer :
for(int a=1; a<=5 ; a++){
    for(int b=1 ; b<=3 ; b++ ){
        if(b==2) break outer;
        System.out.print(a);
    }
}
    }
}
