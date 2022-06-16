package com.alg.ch04;

public class IntQueue {

    private int max;      // 큐의 용량
    private int front;    // 첫번째 요소 커서
    private int rear;     // 마지막 요소 커서
    private int num;      // 현재 데이터 수
    private int[] que;    // 큐 본체

    //실행시 예외 : 큐가 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException() {
        }
    }

    //실행시 예외 : 큐 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException() {
        }
    }

    //생성자
    public IntQueue(int capacity){
        num = front = rear = 0;
        max = capacity;
        try{
            que = new int[max];
        }catch (OutOfMemoryError e){ //생성 할 수 없음
            max = 0;
        }
    }

}
