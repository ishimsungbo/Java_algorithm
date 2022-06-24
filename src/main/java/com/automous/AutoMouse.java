package com.automous;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AutoMouse {

    //마우스 클릭
    public static void mouseAutoMove(int x, int y){

        try{
            Robot robot = new Robot();
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }catch (AWTException e){
            e.getStackTrace();
        }
    }

    // 시간을 쉽게 보기 위한 메서드
    private static String myDateFormat(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    // 일정 시간 간격으로 실행해보기
    private static void timerTaskBatch(){

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(myDateFormat(new Date()) + " 오토 마우스 실행 " + Thread.currentThread().getName());
                PointerInfo p = MouseInfo.getPointerInfo();
                System.out.println(p.getLocation());
                mouseAutoMove(770,440);
            }
        };

        Timer timer = new Timer("[오토마우스 타이머]");
        long delay = 0;
        long period = 3000L;
        timer.schedule(task, delay, period);  //5초 간격으로 실행

    }

    public static void main(String[] args) {
        timerTaskBatch();
    }
}
