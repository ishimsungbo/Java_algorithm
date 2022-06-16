package com.alg.ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 하나의 배열을 공유하여 2개의 스택을 구현해볼까?
public class StackEX {

    public static void main(String[] args) {

        int[] arr = new int[15];
        int a = 1;

        for(int i = 0; i < 5 ;i++){
            arr[i] = a * 10;
            a++;
        };

        for(int i = arr.length-1; i > 9 ; i--){
            //System.out.println(i);
            arr[i] = a * 10;
            a++;
        }

        Arrays.stream(arr).forEach(s -> System.out.print(s+" "));
        //Arrays.stream(arr).sorted().forEach(s -> System.out.println(s));
        //printArr(arr);

    }

    static void printArr(int[] arr){
        for(int i=0; i < arr.length ;i++){
            System.out.print("Array["+i+"]=" + arr[i]+"   ");
        }
    }

}
