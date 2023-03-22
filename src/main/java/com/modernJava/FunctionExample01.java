package com.modernJava;

import java.util.function.Function;

public class FunctionExample01 {

    //주로 데이터를 가공하거나 매핑하는 용도로 많이 사용하며, 비즈니스 로직에 대한 리턴 값이
    //반드시 필요할 경우 Function 인터페이스를 이용하면 좋다

    public static int executeFunction(String context, Function<String, Integer> function){
        return function.apply(context);
    }

    //미납금액을 인자로 받아서 이자금액을 리터?
    public static double exeDoubleFunction(double manageAmt, Function<Double, Double> function){
        return function.apply(manageAmt);
    }

    public static void main(String[] args) {
        int length = FunctionExample01.executeFunction("Hello! Welcome to Java World.", context -> context.length());
        System.out.println(length);

        //내가 만든예제 인자값 double 그리고 리턴한다 70%를...
        double result = FunctionExample01.exeDoubleFunction(10000, amt -> {
            double result01 = amt * 0.7;
            return result01;
        });
        System.out.println(result);
    }
}
