package day02;
import java.util.Arrays;

public class LottoTest2 {
    int lotto [] = new int [6];//0
    int cnt=0;//배열방에 중복없이 숫자가 들어간 개수.

    /**
     * 로또 번호 한개 생성하여 기존 로또번호와 비교하여 같으면 다시 생성.
     * */
    public void createLottoNo(){
        for(int i=0; i<6; i++) {
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
        int len = lotto.length;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
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
        LottoTest2 lotto = new LottoTest2();

        //로또번호를 중복없이 저장하는 메소드 호출
        System.out.println("--정렬하자 ----");
        lotto.createLottoNo();

        //정렬호출
        lotto.lottoSort();
        //출력호출
        lotto.printLotto();
    }
}
