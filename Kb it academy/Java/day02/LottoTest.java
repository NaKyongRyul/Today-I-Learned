package day02;

import java.util.Arrays;

public class LottoTest {
    int lotto [] = new int [6];//0

    /**
     * 로또 번호 생성 및 비교
     * */
    public void createLottoNo(){
        for(int i=0; i<lotto.length; i++) {
            int n = (int)(Math.random()*45) + 1;
            lotto[i] = n;
            for(int j=0; j<i; j++) {
                if(lotto[j] == lotto[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("중복없이 추가완료 : " + Arrays.toString(lotto));
    }

    /**
     * 완성된 6개 번호 올림차순으로 정렬하기
     * */
    public void lottoSort(){
        for(int i = 0; i < lotto.length-1; i++) {
            for(int j = 0; j < lotto.length-1-i; j++) {
                if(lotto[j] > lotto[j+1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1] = temp;
                }
            }
        }
    }

    /**
     * 출력하는 메소드
     * */
    public void printLotto(){
        for(int i : lotto) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        LottoTest lotto = new LottoTest();

        //로또번호를 중복없이 저장하는 메소드 호출
        System.out.println("--정렬하자 ----");
        lotto.createLottoNo();
        //정렬호출
        lotto.lottoSort();
        //출력호출
        lotto.printLotto();
    }
}

