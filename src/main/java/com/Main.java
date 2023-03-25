package com;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            TimeUnit.SECONDS.sleep(3);  //지연시킨다.
            System.out.println("2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
