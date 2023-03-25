package com.modernJava;

import java.util.concurrent.Executor;

public class ExecutorExample_20230325 implements Executor {

    //execute 메서드를 구현한다.


    @Override
    public void execute(Runnable command) {
        // 방법 1. Runnable 인터페이스를 직접 실행한다.
        command.run();

        // 방법2. Thread 를 생성해서 실행한다.
        //new Thread(command).start();
    }

    public static void main(String[] args) {
        ExecutorExample_20230325 executor = new ExecutorExample_20230325();
        executor.execute(()->System.out.println("Hello, Executor!!"));
    }

}
