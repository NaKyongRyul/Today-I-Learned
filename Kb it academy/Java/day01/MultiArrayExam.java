package day01;

public class MultiArrayExam {
    public static void main(String[] args) {
        int[][] arr = new int[3][5]; //3행 5열
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println("arr = " + arr); //주소값
        System.out.println("arr[0] = " + arr[0]); //1차원 배열의 주소값
        System.out.println("arr[0][0] = " + arr[0][0]);

        //배열방의 값을 출력
        int r = arr.length;
        for(int i=0; i<r; i++) {
            int c = arr[i].length;
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //개선된 for문
        for(int[] i:arr) {
            for(int j:i) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }
}
