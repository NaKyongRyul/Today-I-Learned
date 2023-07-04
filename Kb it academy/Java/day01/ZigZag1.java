package com.itskb.ws01;

public class ZigZag1 {
    public static void main(String[] args) {
        int[][] intArray = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int r = intArray.length;
        for(int i=0; i<r; i++) {
            int c = intArray[i].length;
            if(i%2 == 0) {
                for(int j=0; j<c; j++) {
                    System.out.print(intArray[i][j] + " ");
                }
            } else {
                for(int j=c-1; j>=0; j--) {
                    System.out.print(intArray[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
