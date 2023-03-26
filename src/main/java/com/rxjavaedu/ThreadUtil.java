package com.rxjavaedu;

public class ThreadUtil {

    public static void sleep(int time, boolean isDebug){
        try{
            if(isDebug){
                System.out.println("                               "+ time + "초 sleep " + Thread.currentThread().getName());
                Thread.sleep(1000L);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
