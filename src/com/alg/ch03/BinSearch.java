package com.alg.ch03;


import java.util.Arrays;
import java.util.Comparator;

//  이진 검색
// 반을 자르고 반을 자르고
public class BinSearch {

    static int binSearch(int[] a, int n, int key){
        int pl = 0;     // 검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 끝 인덱스

        do{
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스

            if(a[pc] == key ){

                return pc;  //검색 성공

            }else if(a[pc] < key ){ //검색 범위를 뒤쪽 절반으로 좁힘
                pl = pc + 1;
            }else{
                pr = pc - 1; //검색 범위를 앞쪽 절반으로 좁힘.
            }
        }while (pl <= pr);

        return -1;
    }

    // 오름으로 정렬 후... 이진검색을 실시
    public static void main(String[] args) {
        int[] x = {15, 27, 39, 77, 92, 108, 121};
        System.out.println(" 찾는 값은 x["+binSearch(x,7,15) +"]에 있습니다.");
    }

}
