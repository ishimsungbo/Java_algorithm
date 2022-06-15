package com.alg.ch01;

public class PrimeNumber2 {
    public static void main(String[] args) {

        int counter = 0;

            int i;

            for(i=2; i < 5; i++){
                System.out.println(i);
                counter++;
                if(5 % i ==0){ //나누어 떨어지면 소수가 아니다.
                    System.out.println("나누어졌다." + i);
                    break;     //더 이상의 반복은 불필요
                }else{
                    System.out.println("아님");
                }
            }

        System.out.println("끝");

    }
}
