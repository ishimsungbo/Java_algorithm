package com.threadedu;


import static java.lang.Thread.sleep;

class SimpleRun implements Runnable{
    String name;

    public SimpleRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i= 0; i < 5 ;i++){
            System.out.println(this.name); //쓰레드 이름
            try{
                sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        SimpleRun r1 = new SimpleRun("Disney Land");
        SimpleRun r2 = new SimpleRun("\t\t Hong Kong");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
