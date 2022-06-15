package com.alg.ch03;

import java.util.Scanner;

//선형 검색 보초법
public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key){
        int i=0;

        a[n] = key;
        while (true){
            if(a[i]==key){
                break;
            }
            i++;
        }
        //삼항 연산자는 (조건문) : ? 참 : 거짓
        return i == n ? -1 : i;
    }


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = stdin.nextInt();
        int[] x = new int[num + 1];

        for(int i=0 ; i<num ; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdin.nextInt();
        }

        System.out.println("검색할 값 : ");
        int key = stdin.nextInt();

        int idx = seqSearchSen(x, num, key);

        if(idx == -1){
            System.out.println("그런값 없음");
        }else {
            System.out.println("key는 x[" +idx+"]에 있습니다");
        }
    }

}
