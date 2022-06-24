package com.mtimer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

/**
 * 자바 타이머에 대해 알아본다..
 * 1. 일정 시간이 지난 뒤에 실행
 * 2. 정해진 시간에 실행
 * 3. 주기적으로 실행
 * 4. 타이머 끝내기
 */
public class JavaTimerDriven {

    private static String myDateFormat(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    private static TimerTask timerStart3(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(myDateFormat(new Date()) + " 실행 " + Thread.currentThread().getName());
                /*
                try {
                    sleep(5000);
                    System.out.println(myDateFormat(new Date())+"  5초뒤 끝냅니다.");
                    cancel();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                */

            }
        };

        return timerTask;
    };

    // 일정 시간 간격으로 실행해보기
    private static void timerTaskBatch(){

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(myDateFormat(new Date()) + " 실행 " + Thread.currentThread().getName());
            }
        };

        Timer timer = new Timer("[일정시간 간격 실행 타이머]");
        long delay = 3000L;
        long period = 2000L;
        System.out.println(myDateFormat(new Date()) + " 스케줄링 시작");
        timer.schedule(task, delay, period);

    }

    // 일정 시간 지난 후 시작
    private static void timerTaskStartForDelay(){

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(myDateFormat(new Date()) + " 실행 " + Thread.currentThread().getName());
            }
        };

        Timer timer = new Timer("[일정시간 지난 후 타이머]");
        long delay = 3000L;
        //long period = 2000L;
        System.out.println(myDateFormat(new Date()) + " 스케줄링 시작");
        timer.schedule(task, delay);

    }

    // 정해진 시간에 실행
    private static void timerTaskExcute(){


    }

    public static void main(String[] args)throws InterruptedException{
        /**
        System.out.println("3 초뒤에 프로그램 시작" + myDateFormat(new Date()));
        LocalDateTime localDateTime = LocalDateTime.now().plusSeconds(3);  // 3 초 후 실행
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        Timer timer = new Timer("Timer3");
        System.out.println(myDateFormat(new Date()) + " : 스케줄링...");

        timer.schedule(timerStart3(), date);
        Thread.sleep(5000);
        timer.cancel();  //쓰레드를 중지하는 것은 타이머를 이용?
        **/

        //timerTaskBatch();
        //timerTaskStartForDelay();
        //timerTaskExcute();

        LocalDateTime localDateTime = LocalDateTime.now().plusSeconds(3);  // 현재로 부터 3초 후 실행

        LocalDateTime localDateTime1 = LocalDateTime.of(2022,06,24,9,22);  //특정시간 지정

        Date expectDate = Date.from(localDateTime1.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(myDateFormat(new Date()));
        System.out.println(myDateFormat(expectDate));

    }

}
