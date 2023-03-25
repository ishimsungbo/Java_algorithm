package com.modernJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample_20230325 {

    // ExecutorService 사용예
    public static void main(String[] args) {

        // ExecutorService 객체를 생성한다.
        //ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newFixedThreadPool(3);

        // Thread 를 생성하고 실행시킨다.

        es.execute(new MyTask("TODO 1"));
        es.execute(new MyTask("TODO 2"));
        es.execute(new MyTask("TODO 3"));

        // ExecutorService 종료시킨다.
        es.shutdown();
    }
}

class MyTask implements Runnable{
    private String id;

    public MyTask(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=0; i<5 ;i++){
            System.out.println("Task ID : "+ id + ", running * * * " +i);
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
