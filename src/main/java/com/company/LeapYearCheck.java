package com.company;

import java.util.GregorianCalendar;

/**
 * 자바로 윤년을 구하기
 * 해당 년도를 4로 나눈 값이 0인 것을 의미.
 * 그 중 100으로 나눈 값이 0인 것은 윤년에서 제외
 * 400으로 나눈 값이 0인 것은 윤년으로 포함. 그외는 모두 평년으로 판단
 */
public class LeapYearCheck {
    public static void getLeapYear(){
        for(int year=2010; year < 2031 ; year++){
            if(year % 4==0 && year % 100 !=0 || year % 400 ==0){
                System.out.println(year+" 은 윤년 입니다.");
            }else{
                System.out.println(year+" 은 평년 입니다.");
            }
        }

    }
    public static void main(String[] args) {
        LeapYearCheck.getLeapYear();

        int year = 2024;
        GregorianCalendar gc = new GregorianCalendar();
        if(gc.isLeapYear(year)){
            System.out.println(year+" 은 윤년 입니다.");
        }else{
            System.out.println(year+" 은 평년 입니다.");
        }

    }
}
