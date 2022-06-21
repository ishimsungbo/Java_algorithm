package com.alg.ch03;

import java.util.Scanner;

//선형 검색이라함.
public class SeqSearch {

    //요소수가 n 인 배열에서 key와 같은 요소를 선형 검색합니다.
    static int seqSearch(int[] a, int n, int key){
        int i = 0;
        while(true){
            if(i == n){
                return -1; //검색 실패(-1을 반환)
            }

            if(a[i] == key){
                return 1;   // 검색 성공[인덱스를 반환]
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i =0;i < num ; i++){
            System.out.print("x["+i+"] :");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : "); //키 값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num , ky); //배열 x에서 키 값이 ky인 요소를 검색

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다");
        }else{
            System.out.println(ky+" 는 x["+idx+"] 값에 있습니다.");
        }
    }

}
