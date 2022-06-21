package com.alg.ch01;

public class PrimeNumber1 {
    public static void main(String[] args) {

        int counter = 0;

        for(int n=2;n <=1000; n++){

            //System.out.println(n);
            int i;
            for(i=2; i < n; i++){
                counter++;
                //System.out.println("==> "+n);
                if(n % i ==0){ //나누어 떨어지면 소수가 아니다.
                    System.out.println("나누어짐 "+i);
                    break;     //더 이상의 반복은 불필요
                }
            }
            if(n == i){  //마지막까지 나누어떨어지지 않음
                System.out.println(n);
            }

        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
