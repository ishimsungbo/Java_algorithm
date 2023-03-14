package com.modernJava;

import java.util.function.Function;

public class FunctionExample {

    //주로 데이터를 가공하거나 매핑하는 용도로 많이 사용하며, 비즈니스 로직에 대한 리턴 값이
    //반드시 필요할 경우 Function 인터페이스를 이용하면 좋다

    public static int executeFunction(String context, Function<String, Integer> function){
        return function.apply(context);
    }
    public static void main(String[] args) {
        int length = FunctionExample.executeFunction("Hello! Welcome to Java World.", context -> context.length());
        System.out.println(length);
    }
}
