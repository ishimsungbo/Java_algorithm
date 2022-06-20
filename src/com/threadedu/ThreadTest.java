package com.threadedu;

class SimpeleThread extends Thread{

    public SimpeleThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        for(int i= 0; i < 5 ;i++){
            System.out.println(getName()); //쓰레드 이름
            try{
                //sleep((long) (Math.random() * 1000));
                sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        SimpeleThread t1 = new SimpeleThread("쓰레드 1");
        SimpeleThread t2 = new SimpeleThread("\t\t 쓰레드 2");

        t1.start();
        t2.start();
    }
}