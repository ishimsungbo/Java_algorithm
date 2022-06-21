package com.threadedu;

public class DaemonThread  extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Thread Start ...");
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }finally {
            System.out.println("Thread Dead...");
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        //t.setDaemon(true);
        t.start();
        System.out.println("Main 쓰레드 종료");
    }
}
