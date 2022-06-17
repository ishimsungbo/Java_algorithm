package com.threadedu;

public class APITest  extends Thread{

    @Override
    public void run() {
        System.out.println("------ in child ------");
        System.out.println("count = "+ activeCount());
        Thread myThread = Thread.currentThread();
        myThread.setName("Child Thread");
        System.out.println("current Thread = " + myThread);
        System.out.println("priority = " + myThread.getPriority());
        System.out.println("alive  = " + myThread.isAlive());
        System.out.println("Demon = " + myThread.isDaemon());
    }

    public static void main(String[] args) {
        System.out.println("count = "+ Thread.activeCount());
        Thread myThread = Thread.currentThread();
        System.out.println("current Thread = " + myThread);
        System.out.println("priority = " + myThread.getPriority());
        System.out.println("alive  = " + myThread.isAlive());
        System.out.println("Demon = " + myThread.isDaemon());

        APITest child = new APITest();
        child.setDaemon(true);
        child.setPriority(8);
        child.start();
        try{
            child.join();
        }catch (InterruptedException e){

        }
    }
}
